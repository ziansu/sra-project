public java.lang.String setFirst(java.lang.String key, java.lang.String valueToSet, java.lang.String input) {
    java.lang.String value = extractOne(key, input);
    java.lang.String keyVal = ((key + "={") + value) + "}";
    java.lang.String newKeyVal = ((key + "={") + valueToSet) + "}";
    java.lang.String replaced = input.replaceFirst(java.util.regex.Pattern.quote(keyVal), newKeyVal);
    return replaced;
}