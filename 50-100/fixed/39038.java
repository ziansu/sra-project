public boolean addPhysicianVisit(edu.adams.backendboys.Injury injury, edu.adams.backendboys.PhysicianVisit visit) {
    java.lang.String table = "PHYSICIANVISIT";
    java.lang.String[] data = new java.lang.String[]{ "(INJURYID,DATE,NOTE)" , ("" + (injury.getInjuryID())) + "," , ("'" + (visit.getDate())) + "'," , ("'" + (visit.getNote())) + "'" };
    return database.insert(table, data);
}