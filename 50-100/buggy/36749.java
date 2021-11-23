public void setRoute(java.lang.String route) {
    this.route = route;
    java.lang.String[] routeList = route.split(",");
    this.siteCount = (routeList.length) + 1;
    java.lang.String[] routeListAll = new java.lang.String[this.siteCount];
    for (int i = 0; i < (routeList.length); i++) {
        routeListAll[i] = routeList[i];
    }
    routeListAll[routeList.length] = this.starting;
    this.routeList = routeListAll;
}