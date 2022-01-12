@org.sakaiproject.entitybroker.entityprovider.annotations.EntityURLRedirect(value = "/{prefix}/wall/{userUuid}/item/{wallItemId}")
public java.lang.String redirectToMyWallItem(final java.util.Map<java.lang.String, java.lang.String> vars) {
    return this.linkLogic.getInternalDirectUrlToUserWall(vars.get("userUuid"), vars.get("wallItemId"));
}