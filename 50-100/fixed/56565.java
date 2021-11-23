@java.lang.Override
public boolean evaluate(Data item) {
    java.lang.String[] categoriesArray = categorizer.getCategories(item);
    if (categoriesArray == null) {
        return true;
    }else {
        for (java.lang.String categoryItem : categoriesArray) {
            if (category.equals(categoryItem)) {
                return true;
            }
        }
        return false;
    }
}