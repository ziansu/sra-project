private boolean checkifCategoriesContainsOnlyOneNonFacetCategory(java.util.List<java.lang.String> categories, java.lang.String categoryName) {
    boolean contains = false;
    if (((categories != null) && (!(categories.isEmpty()))) && (org.apache.commons.lang3.StringUtils.isNotBlank(categoryName))) {
        if (((categories.size()) == 1) && (categories.get(0).equals(categoryName))) {
            contains = true;
        }
    }
    return contains;
}