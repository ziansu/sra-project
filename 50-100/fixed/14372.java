private boolean initNewCategoryList(seedu.taskboss.model.category.Category oldCategory, seedu.taskboss.model.category.Category newCategory, seedu.taskboss.model.category.UniqueCategoryList targetCategoryList, seedu.taskboss.model.category.UniqueCategoryList newCategoryList) throws seedu.taskboss.commons.exceptions.IllegalValueException, seedu.taskboss.model.category.UniqueCategoryList.DuplicateCategoryException {
    boolean isOldCategoryFound = false;
    for (seedu.taskboss.model.category.Category category : targetCategoryList) {
        if (category.equals(oldCategory)) {
            isOldCategoryFound = true;
            newCategoryList.add(newCategory);
        }else {
            newCategoryList.add(category);
        }
    }
    return isOldCategoryFound;
}