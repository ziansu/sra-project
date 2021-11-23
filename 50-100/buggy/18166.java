public void setStringList(java.lang.String key, java.util.List<java.lang.String> value) {
    java.lang.StringBuilder result = new java.lang.StringBuilder();
    for (java.lang.String element : value) {
        if (!(result.toString().equals(""))) {
            result.append(", ");
        }
        result.append(element);
    }
    if (result.toString().equals("")) {
        result.append("None");
    }
    configuration.setProperty(key, result);
}