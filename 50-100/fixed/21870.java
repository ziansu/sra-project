public void printInfo() {
    super.printInfo();
    if ((this.teaching.size()) != 0) {
        java.lang.System.out.println("[Teaching courses]");
        for (RegCourse i : this.teaching) {
            java.lang.System.out.println((((i.getCourseCode()) + " - ") + (i.getCourseName())));
        }
    }
}