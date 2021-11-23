protected final boolean hasRouteTo(java.lang.String url, act.route.Router router) {
    return null != (router.findStaticGetHandler(url));
}