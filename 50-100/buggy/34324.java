@java.lang.Override
public java.lang.String toString() {
    java.lang.StringBuilder result = new java.lang.StringBuilder();
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry : users.entrySet()) {
        java.lang.String key = entry.getKey();
        java.lang.String value = entry.getValue();
        result.append((((key + "=") + value) + ";"));
    }
    return result.toString();
}