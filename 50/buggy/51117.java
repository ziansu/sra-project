@org.sakaiproject.entitybroker.entityprovider.annotations.EntityURLRedirect(value = "/{prefix}/wall/{userUuid}/{wallItemId}")
public java.lang.String redirectToMyWallItem(java.util.Map<java.lang.String, java.lang.String> vars) {
    return linkLogic.getInternalDirectUrlToUserWall(vars.get("userUuid"), vars.get("wallItemId"));
}