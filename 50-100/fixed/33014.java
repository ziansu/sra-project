public static java.lang.String getResourceIdFromId(java.lang.String sourceTranslationId) {
    java.lang.String[] complexId = sourceTranslationId.split("-");
    if ((complexId.length) >= 3) {
        return complexId[((complexId.length) - 1)];
    }else {
        throw new java.lang.StringIndexOutOfBoundsException(("malformed source translation id" + sourceTranslationId));
    }
}