private com.sandarovich.kickstarter.category.Categories setupCategories() {
    final java.util.List<java.lang.String> categories = new java.util.ArrayList<java.lang.String>() {
        {
            add("IT");
            add("Tourism");
            add("Garden");
        }
    };
    com.sandarovich.kickstarter.category.CategoriesBuilder builder = new com.sandarovich.kickstarter.category.CategoriesBuilder();
    builder.createAll(categories);
    return builder.get();
}