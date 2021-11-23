public static java.lang.String removeCategoryFromString(java.lang.String toDoString, java.lang.String category) {
    boolean isCategorised = !(category.equals(Constant.CATEGORY_UNCATEGORISED));
    java.lang.String lowerCase = (toDoString.toLowerCase()) + " ";
    if (isCategorised) {
        java.lang.String categoryCommand = (Command.CATEGORY.getBasicCommand()) + (category.toLowerCase());
        int endIndex = lowerCase.indexOf(categoryCommand);
        toDoString = toDoString.substring(0, endIndex);
    }
    return toDoString;
}