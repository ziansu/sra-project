private boolean initNewCategoryList(seedu.taskboss.model.category.Category oldCategory, seedu.taskboss.model.category.Category newCategory, boolean isOldCategoryFound, seedu.taskboss.model.category.UniqueCategoryList targetCategoryList, seedu.taskboss.model.category.UniqueCategoryList newCategoryList) throws seedu.taskboss.commons.exceptions.IllegalValueException, seedu.taskboss.model.category.UniqueCategoryList.DuplicateCategoryException {
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