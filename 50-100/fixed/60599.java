private com.sandarovich.kickstarter.category.Categories setupCategories() {
    java.util.List<java.lang.String> categories = new java.util.ArrayList<java.lang.String>();
    categories.add("IT");
    categories.add("Tourism");
    categories.add("Garden");
    com.sandarovich.kickstarter.category.CategoriesBuilder builder = new com.sandarovich.kickstarter.category.CategoriesBuilder();
    builder.createAll(categories);
    return builder.get();
}