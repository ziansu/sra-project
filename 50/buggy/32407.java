private java.lang.String handleUnsafeChars(java.lang.String raw) {
    return raw.replace("\n", "").replace("\r", "").replace("\t", "").replace("'", "\\\'");
}