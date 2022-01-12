public java.lang.String getDataNumber(java.lang.String param) {
    param = param.replaceAll("\\D+", "");
    try {
        return param;
    } catch (java.lang.NullPointerException e) {
        return "0";
    }
}