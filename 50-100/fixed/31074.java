private java.lang.String checkForConst(java.lang.String param) {
    java.lang.String value = param;
    if (main.ConstantManager.getInstance().getMap().keySet().contains(param.toUpperCase())) {
        value = main.ConstantManager.getInstance().getMap().get(param.toUpperCase());
    }
    try {
        java.lang.Double.valueOf(value);
    } catch (java.lang.NumberFormatException nfe) {
    }
    return value;
}