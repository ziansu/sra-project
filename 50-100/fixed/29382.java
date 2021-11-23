@java.lang.Override
public java.lang.String updateCD(java.lang.Integer cdId, java.lang.String jsonCDUpdated) {
    com.qa.cdstore.model.CD updatingCD = util.getObjectForJSON(jsonCDUpdated, com.qa.cdstore.model.CD.class);
    com.qa.cdstore.model.CD cd = findCD(cdId);
    if (cd != null) {
        cd = updatingCD;
        em.merge(cd);
    }
    return "{\"message\": \"cd successfully updated\"}";
}