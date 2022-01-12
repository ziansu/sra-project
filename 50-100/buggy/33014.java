public static java.lang.String getResourceIdFromId(java.lang.String sourceTranslationId) {
    java.lang.String[] complexId = sourceTranslationId.split("-", 3);
    if ((complexId.length) == 3) {
        return complexId[2];
    }else {
        throw new java.lang.StringIndexOutOfBoundsException(("malformed source translation id" + sourceTranslationId));
    }
}