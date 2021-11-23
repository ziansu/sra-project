public void renameCategory(seedu.taskboss.model.category.Category oldCategory, seedu.taskboss.model.category.Category newCategory) throws seedu.taskboss.commons.exceptions.IllegalValueException, seedu.taskboss.logic.commands.exceptions.CommandException {
    assert oldCategory != null;
    boolean isOldCategoryFound = false;
    for (seedu.taskboss.model.task.Task task : this) {
        seedu.taskboss.model.category.UniqueCategoryList targetCategoryList = task.getCategories();
        seedu.taskboss.model.category.UniqueCategoryList newCategoryList = new seedu.taskboss.model.category.UniqueCategoryList();
        try {
            isOldCategoryFound = initNewCategoryList(oldCategory, newCategory, isOldCategoryFound, targetCategoryList, newCategoryList);
        } catch (seedu.taskboss.model.category.UniqueCategoryList.DuplicateCategoryException dce) {
            throw new seedu.taskboss.model.category.UniqueCategoryList.DuplicateCategoryException();
        }
        task.setCategories(newCategoryList);
    }
    errorDoesNotExistDetect(oldCategory, isOldCategoryFound);
}