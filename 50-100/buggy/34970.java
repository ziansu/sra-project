private void addKeyValueParam(java.lang.String paramName, java.lang.String paramValue) {
    if ((paramValue != null) && (!(paramValue.trim().isEmpty()))) {
        params.add(((paramName + "=") + (urlEncode(paramValue))));
    }
}