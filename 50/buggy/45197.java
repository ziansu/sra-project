public static boolean isCorrectRecordId(java.lang.String recordId, int bibLibLength) {
    if ((recordId.length()) == ((AlephConstants.BIB_ID_LENGTH) + bibLibLength)) {
        return true;
    }
    return false;
}