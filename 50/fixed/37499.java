private dooyit.parser.AddCategoryParser.ADD_CATEGORY_TYPE getCommandType() {
    if (dooyit.parser.AddCategoryParser.userInput.equals("")) {
        return dooyit.parser.AddCategoryParser.ADD_CATEGORY_TYPE.INVALID;
    }else
        if (dooyit.parser.AddCategoryParser.hasTasks) {
            return dooyit.parser.AddCategoryParser.ADD_CATEGORY_TYPE.CREATE_NEW_CATEGORY_WITH_TASKS;
        }else {
            return dooyit.parser.AddCategoryParser.ADD_CATEGORY_TYPE.CREATE_NEW_CATEGORY_WITHOUT_TASKS;
        }
    
}