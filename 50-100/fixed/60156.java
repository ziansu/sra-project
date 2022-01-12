public boolean removeField(java.lang.String nameOfFieldToDelete) {
    boolean wasSuccessful = false;
    if (((getFieldIndexByName(nameOfFieldToDelete)) != (-1)) || ((getFieldIndexByName(nameOfFieldToDelete)) >= (fieldContents.size()))) {
        fieldContents.remove(getFieldIndexByName(nameOfFieldToDelete));
        fieldNames.remove(getFieldIndexByName(nameOfFieldToDelete));
        wasSuccessful = updateContactFile();
    }else {
        wasSuccessful = false;
    }
    return wasSuccessful;
}