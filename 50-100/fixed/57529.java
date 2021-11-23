private java.lang.String[] getParameterArray(java.lang.String[] tokenList) {
    if ((tokenList.length) == 1) {
        return new java.lang.String[1];
    }else {
        java.lang.String[] parameters = new java.lang.String[(tokenList.length) - 1];
        for (int i = 0; i < (parameters.length); i++) {
            parameters[i] = tokenList[(i + 1)];
        }
        return parameters;
    }
}