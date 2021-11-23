public java.lang.String getAbsoluteUriPattern() {
    if ((absoluteUriPattern) == null) {
        ro.pippo.core.route.RouteGroup group = this.group;
        java.lang.String path = this.uriPattern;
        while (group != null) {
            path = ro.pippo.core.util.StringUtils.addStart(ro.pippo.core.util.StringUtils.addStart(path, "/"), group.getUriPattern());
            group = group.getParent();
        } 
        absoluteUriPattern = ro.pippo.core.util.StringUtils.removeEnd(path, "/");
    }
    return absoluteUriPattern;
}