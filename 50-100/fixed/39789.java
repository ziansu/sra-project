private java.lang.String convertJoinpointArgsToString(final java.lang.Object[] joinPointArgs) {
    java.lang.String returnValue = new java.lang.String();
    if (joinPointArgs != null) {
        for (final java.lang.Object obj : joinPointArgs) {
            returnValue += obj + ";";
        }
        returnValue = returnValue.replaceAll("\\s+", " ");
    }
    return returnValue;
}