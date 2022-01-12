public java.util.List<com.kwetter.beans.Kweet> getTimeline() {
    java.util.Map<java.lang.String, java.lang.String> parameterMap = this.externalContext.getRequestParameterMap();
    java.lang.String username = parameterMap.get("u");
    user = this.kwetterService.findByUserName(username);
    java.util.List<com.kwetter.beans.Kweet> kweets = kwetterService.getOwnAndFollowing(user);
    return kweets;
}