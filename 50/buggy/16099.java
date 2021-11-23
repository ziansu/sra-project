public static void notNullOrEmpty(java.lang.Object source, java.lang.String str, java.lang.String fieldName) throws com.riskified.validations.FieldBadFormatException {
    if ((str == null) || (str != "")) {
        throw new com.riskified.validations.FieldBadFormatException(source, (fieldName + " can't be null or empty."));
    }
}