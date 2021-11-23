private boolean isFieldValid(int fieldIndex, java.lang.String value) {
    if (value != null) {
        return addressbook.InputValidation.isValidStringForFieldIndex(value, fieldIndex);
    }else {
        return false;
    }
}