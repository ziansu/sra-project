@java.lang.Override
protected V processArg(java.lang.Integer parameter) {
    try {
        return list.evaluate().get(parameter);
    } catch (java.lang.IndexOutOfBoundsException iEOBEx) {
        return null;
    }
}