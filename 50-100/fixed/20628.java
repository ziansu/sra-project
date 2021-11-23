public boolean modifyField(java.lang.String nameOfFieldToModify, java.lang.String newFieldContents) {
    boolean wasSuccessful = false;
    if (((getFieldIndexByName(nameOfFieldToModify)) != (-1)) || ((getFieldIndexByName(nameOfFieldToModify)) >= (fieldContents.size()))) {
        fieldContents.set(getFieldIndexByName(nameOfFieldToModify), newFieldContents);
        wasSuccessful = updateContactFile();
    }else {
        wasSuccessful = false;
    }
    return wasSuccessful;
}