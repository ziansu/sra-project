public int getDataNumber(java.lang.String param) {
    param = param.replaceAll("\\D+", "");
    try {
        return java.lang.Integer.parseInt(param);
    } catch (java.lang.NullPointerException e) {
        return 0;
    }
}