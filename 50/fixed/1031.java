public void onActivate() {
    if ((searchQuery) != null) {
        allCourses = this.courseDAO.searchCourses(java.util.Arrays.asList(searchQuery.split(" ")));
    }
}