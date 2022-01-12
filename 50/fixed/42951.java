public java.util.Date parseLong(java.lang.Long v, java.lang.reflect.Type type) {
    try {
        return v != null ? new java.util.Date(v) : null;
    } catch (java.lang.Exception ex) {
        ex.printStackTrace();
        return null;
    }
}