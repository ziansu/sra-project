private java.util.Map<java.lang.String, java.lang.Boolean> validateFieldsLength(java.util.Map<java.lang.String, java.lang.String> fields, int requiredMin) {
    java.util.Map<java.lang.String, java.lang.Boolean> returnedMap = new java.util.HashMap<>(fields.size());
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : fields.entrySet()) {
        returnedMap.put(entry.getKey(), validateFieldLength(entry.getValue(), requiredMin));
    }
    return returnedMap;
}