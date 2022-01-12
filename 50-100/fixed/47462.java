public java.util.List<java.lang.String> loadFacultyNames() {
    final java.util.List<java.lang.String> faculties = new java.util.ArrayList<>();
    facultyList.forEach(new java.util.function.Consumer<upandgo.shared.entities.Faculty>() {
        @java.lang.Override
        public void accept(upandgo.shared.entities.Faculty λ) {
            faculties.add(λ.getName());
        }
    });
    return faculties;
}