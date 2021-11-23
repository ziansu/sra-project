public java.util.ArrayList<java.lang.String> getValidOptions() {
    if ((defValue.getClass()) == (java.lang.Boolean.class)) {
        java.util.ArrayList<java.lang.String> validOptions = new java.util.ArrayList<>();
        validOptions.add("TRUE");
        validOptions.add("FALSE");
        return validOptions;
    }else
        return null;
    
}