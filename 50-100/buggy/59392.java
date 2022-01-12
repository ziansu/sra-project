public java.lang.String print(java.lang.String... inlineData) {
    java.lang.String error = (((("Error(id:" + (ordinal())) + ") ") + (errorName)) + ": ") + (errorDetail);
    for (java.lang.String dat : inlineData) {
        error.replaceFirst("[{}]", dat);
    }
    return error;
}