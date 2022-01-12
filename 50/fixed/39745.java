private boolean isNumberNormal(java.lang.String phoneNumber) {
    if (phoneNumber == null) {
        return false;
    }
    return com.medziku.motoresponder.logic.PhoneNumbersComparator.isNumberNormal(phoneNumber);
}