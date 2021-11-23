public java.util.List<com.kwetter.beans.Kweet> getTimeline() {
    java.util.Map<java.lang.String, java.lang.String> parameterMap = this.externalContext.getRequestParameterMap();
    java.lang.String username = parameterMap.get("u");
    java.util.List<com.kwetter.beans.Kweet> kweets = kwetterService.getOwnAndFollowing(kwetterService.findByUserName(username));
    return kweets;
}