public static java.lang.String getTargetLanguageIdFromId(java.lang.String targetTranslationId) throws java.lang.StringIndexOutOfBoundsException {
    java.lang.String[] complexId = targetTranslationId.split("-");
    if ((complexId.length) >= 3) {
        java.lang.String targetLanguageId = complexId[2];
        for (int i = 3; i < (complexId.length); i++) {
            targetLanguageId += "-" + (complexId[i]);
        }
        return targetLanguageId;
    }else {
        throw new java.lang.StringIndexOutOfBoundsException(("malformed target translation id" + targetTranslationId));
    }
}