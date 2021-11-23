private void categoriesSetUp(java.util.Set<java.lang.String> categories, final java.util.Set<seedu.taskboss.model.category.Category> categorySet) throws seedu.taskboss.commons.exceptions.BuiltInCategoryException, seedu.taskboss.commons.exceptions.IllegalValueException {
    categorySet.add(new seedu.taskboss.model.category.Category(seedu.taskboss.logic.commands.AddCommand.BUILT_IN_ALL_TASKS));
    if (categories.contains(seedu.taskboss.logic.commands.AddCommand.BUILT_IN_DONE)) {
        throw new seedu.taskboss.commons.exceptions.BuiltInCategoryException(seedu.taskboss.logic.commands.AddCommand.ERROR_CANNOT_ADD_DONE_CATEGORY);
    }
    for (java.lang.String categoryName : categories) {
        categorySet.add(new seedu.taskboss.model.category.Category(categoryName));
    }
}