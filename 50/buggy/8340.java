@org.sakaiproject.entitybroker.entityprovider.annotations.EntityURLRedirect(value = "/{prefix}/profile/{userUuid}")
public java.lang.String redirectToUserProfile(java.util.Map<java.lang.String, java.lang.String> vars) {
    return linkLogic.getInternalDirectUrlToUserProfile(vars.get("userUuid"));
}