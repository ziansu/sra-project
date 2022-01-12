private boolean isFloat(java.lang.String str) {
    if (str.contains("$")) {
        return isRegisterFloat.get(str);
    }else {
        return ((str.contains(".")) || (str.startsWith("_f"))) || (str.endsWith("_float"));
    }
}