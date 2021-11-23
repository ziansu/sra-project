public static java.lang.String searchRoute(java.lang.String graphContent, java.lang.String condition) {
    com.routesearch.route.Route.topo = com.filetool.util.Util.FormatData(graphContent);
    com.routesearch.route.Route.FormatCondition(condition);
    com.routesearch.route.Route.initPointsArray();
    com.routesearch.route.Route.initPassSet();
    com.routesearch.route.Route.initHeapArray();
    com.routesearch.route.Route.findnextPointList();
    com.filetool.util.LogUtil.printLog("Format");
    return com.routesearch.route.Route.FormatResult();
}