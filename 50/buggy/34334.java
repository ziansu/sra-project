@org.sakaiproject.entitybroker.entityprovider.annotations.EntityURLRedirect(value = "/{prefix}/wall/{userUuid}")
public java.lang.String redirectToMyWall(java.util.Map<java.lang.String, java.lang.String> vars) {
    return linkLogic.getInternalDirectUrlToUserWall(vars.get("userUuid"), null);
}