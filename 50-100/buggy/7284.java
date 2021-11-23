public java.util.ArrayList<java.lang.String> getCategoryEndList() {
    java.util.ArrayList<java.lang.String> categoryEndList = new java.util.ArrayList<java.lang.String>();
    for (com.nusclimb.live.crimp.common.json.CategoriesResponseBody.Category c : categoriesInfo.getCategories()) {
        categoryEndList.add(c.getTimeEnd());
    }
    return categoryEndList;
}