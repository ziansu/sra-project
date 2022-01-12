private static void initializeStudents() {
    model.server.PeopleSoftServer.initialize();
    for (model.roster.Student student : model.server.PeopleSoftServer.getStudents()) {
        model.server.Server.students.add(student);
    }
    model.server.Server.associatedClasses = new java.util.HashMap<java.lang.String, java.util.ArrayList<java.lang.String>>();
    for (model.roster.Student student : model.server.Server.students) {
        model.server.Server.associatedClasses.put(student.getId(), new java.util.ArrayList<java.lang.String>());
    }
    model.driver.Debug.log("Initializing Server", "Students Loaded");
}