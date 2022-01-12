private java.lang.Object saveFormat(java.lang.Object value) {
    if (value == null) {
        return null;
    }
    if (value instanceof java.lang.Boolean) {
        return ((java.lang.Boolean) (value)) ? 1 : 0;
    }else {
        try {
            return java.lang.Integer.valueOf(value.toString());
        } catch (java.lang.Exception ex) {
            return value;
        }
    }
}