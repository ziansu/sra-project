public com.google.javascript.jscomp.JSError[] getErrors() {
    if ((errorManager) == null) {
        return new com.google.javascript.jscomp.JSError[]{  };
    }
    return errorManager.getErrors();
}