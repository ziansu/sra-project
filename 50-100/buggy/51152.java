public static java.util.List<org.reactome.web.pwp.model.client.classes.Event> getEvents(java.lang.String[] identifiers, java.util.Map<java.lang.String, org.reactome.web.pwp.model.client.classes.DatabaseObject> map) {
    java.util.List<org.reactome.web.pwp.model.client.classes.Event> rtn = new java.util.LinkedList<>();
    for (java.lang.String identifier : identifiers) {
        org.reactome.web.pwp.model.client.classes.DatabaseObject databaseObject = map.get(identifier);
        if (databaseObject instanceof org.reactome.web.pwp.model.client.classes.Event) {
            rtn.add(((org.reactome.web.pwp.model.client.classes.Event) (databaseObject)));
        }
    }
    return rtn;
}