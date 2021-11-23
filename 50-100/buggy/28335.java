@java.lang.Override
protected boolean isRegistered(java.lang.CharSequence literal, java.lang.String token) throws org.relaxng.datatype.DatatypeException {
    if ("shortcut".equals(token)) {
        if ("shortcut icon".equals(toAsciiLowerCase(literal))) {
            return true;
        }else {
            throw new org.relaxng.datatype.DatatypeException(("If the \u201cshortcut\u201d" + ((" keyword is present, the \u201crel\u201d" + " attribute's entire value must be") + " \u201cshortcut icon\u201d.")));
        }
    }else {
        return nu.validator.datatype.LinkRel.registeredValues.contains(token.toLowerCase());
    }
}