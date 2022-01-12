public void checkUrls() throws java.io.IOException, java.net.URISyntaxException {
    for (java.lang.String courseName : data.getAllCourses()) {
        if (!(data.containsUrl(courseName))) {
            java.lang.String courseUrl = scraper.getCourseUrl(courseName);
            data.getCourseTriple(courseName).setUrl(courseUrl);
        }
    }
    saveData();
    java.lang.System.out.println("Checked urls.");
}