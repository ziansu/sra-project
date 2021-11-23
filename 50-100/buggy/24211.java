public static java.util.ArrayList<model.roster.Student> getStudentsAssociatedWithRoster(model.roster.Roster roster) {
    java.util.ArrayList<model.roster.Student> list = new java.util.ArrayList<model.roster.Student>();
    for (model.roster.Student student : model.server.Server.associatedClasses.keySet()) {
        if (model.server.Server.associatedClasses.get(student).contains(roster.courseName())) {
            list.add(student);
        }
    }
    return list;
}