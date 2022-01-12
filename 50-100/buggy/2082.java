public void printStudents() {
    if ((size) > 0) {
        for (int i = 0; i < (size); i++) {
            java.lang.System.out.print((("Id: " + (ids[i])) + ", "));
            java.lang.System.out.println(("Name: " + (names[i])));
        }
    }else {
        java.lang.System.out.println("no students");
    }
}