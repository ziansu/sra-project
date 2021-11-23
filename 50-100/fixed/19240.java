@java.lang.Override
public java.util.List<org.jevis.api.JEVisRelationship> getRelationships() throws org.jevis.api.JEVisException {
    if ((relationships) == null) {
        relationships = new java.util.ArrayList<>();
        for (org.jevis.commons.ws.json.JsonRelationship rel : json.getRelationships()) {
            try {
                org.jevis.api.JEVisRelationship newRel = new org.jevis.jeapi.ws.JEVisRelationshipWS(ds, rel);
                relationships.add(newRel);
            } catch (java.lang.Exception ex) {
                ex.printStackTrace();
            }
        }
    }
    return relationships;
}