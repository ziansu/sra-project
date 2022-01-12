private java.util.List<java.lang.String> createCategoryList(java.lang.String categoryName) {
    com.grouptwo.zalada.stockmanage.domain.Category category = mongoTemplete.findOne(queryByName(categoryName), com.grouptwo.zalada.stockmanage.domain.Category.class);
    java.util.List<java.lang.String> categoryList = new java.util.ArrayList<>();
    categoryList.add(categoryName);
    for (java.lang.String eachParent : category.getParents()) {
        categoryList.add(eachParent);
    }
    for (java.lang.String eachChild : category.getChildren()) {
        categoryList.add(eachChild);
    }
    return categoryList;
}