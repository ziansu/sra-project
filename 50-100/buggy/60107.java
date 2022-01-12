public java.util.ArrayList<java.lang.String> getRouteNameList() {
    java.util.ArrayList<java.lang.String> routeNameList = new java.util.ArrayList<java.lang.String>();
    for (com.nusclimb.live.crimp.common.json.CategoriesResponseBody.Category c : categoriesInfo.getCategories()) {
        for (com.nusclimb.live.crimp.common.json.CategoriesResponseBody.Category.Route r : c.getRoutes()) {
            routeNameList.add(r.getRouteName());
        }
    }
    return routeNameList;
}