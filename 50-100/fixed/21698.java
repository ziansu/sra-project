public static java.util.ArrayList<java.lang.String> getStudentsAssociatedWithRoster(model.roster.Roster roster) {
    java.util.ArrayList<java.lang.String> list = new java.util.ArrayList<java.lang.String>();
    if ((model.server.Server.associatedClasses) != null) {
        for (java.lang.String id : model.server.Server.associatedClasses.keySet()) {
            if (model.server.Server.associatedClasses.get(id).contains(roster.courseName())) {
                list.add(id);
            }
        }
    }
    return list;
}