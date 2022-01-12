public java.util.ArrayList<Algorithm.Course> getCourses() {
    java.util.ArrayList<Algorithm.Course> array = new java.util.ArrayList<>();
    for (Algorithm.Semester sem : this.semesters) {
        array.addAll(sem.getCourses());
    }
    return array;
}