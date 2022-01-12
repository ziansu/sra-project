private boolean isFloat(java.lang.String str) {
    if (str.contains("$")) {
        str = str.replaceAll("\\$", "");
        int registerNumber = java.lang.Integer.parseInt(str);
        return isRegisterFloat[registerNumber];
    }else {
        return ((str.contains(".")) || (str.startsWith("_f"))) || (str.endsWith("_float"));
    }
}