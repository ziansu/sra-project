private void setCategories(java.lang.String[] categories) {
    for (java.lang.String category : categories) {
        if (category == null) {
            throw new java.lang.NullPointerException();
        }
    }
    java.util.List<java.lang.String> categoryList = java.util.Arrays.asList(categories);
    if ((new java.util.HashSet<>(categoryList).size()) != (categoryList.size())) {
        throw new java.lang.IllegalArgumentException("Duplicate category.");
    }
    this.categoriesCopy = java.util.Collections.unmodifiableList(edu.cmu.tetrad.data.DiscreteVariable.getStoredCategoryList(categoryList));
}