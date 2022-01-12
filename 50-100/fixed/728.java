public java.util.ArrayList<java.lang.Integer> getCategoryRouteCountList() {
    java.util.ArrayList<java.lang.Integer> categoryRouteCountList = new java.util.ArrayList<java.lang.Integer>();
    if ((categoriesInfo.getCategories()) != null) {
        for (com.nusclimb.live.crimp.common.json.CategoriesResponseBody.Category c : categoriesInfo.getCategories()) {
            categoryRouteCountList.add(c.getRoutes().size());
        }
    }
    return categoryRouteCountList;
}