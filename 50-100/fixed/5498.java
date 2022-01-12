private int getEditType() {
    int editType;
    if (hasTooManyWordsInNewCategoryName) {
        editType = dooyit.parser.EditCategoryParser.INVALID_TOO_MANY_WORDS;
    }else
        if (hasInsufficientArguments) {
            editType = dooyit.parser.EditCategoryParser.INVALID_TOO_FEW_ARGUMENTS;
        }else
            if ((hasNewName) && (hasNewColour)) {
                editType = dooyit.parser.EditCategoryParser.EDIT_NAME_AND_COLOUR;
            }else
                if ((!(hasNewName)) && (hasNewColour)) {
                    editType = dooyit.parser.EditCategoryParser.EDIT_COLOUR_ONLY;
                }else
                    if ((hasNewName) && (!(hasNewColour))) {
                        editType = dooyit.parser.EditCategoryParser.EDIT_NAME_ONLY;
                    }else {
                        editType = dooyit.parser.EditCategoryParser.EDIT_INVALID;
                    }
                
            
        
    
    return editType;
}