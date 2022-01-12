private java.lang.String checkForConst(java.lang.String param) {
    java.lang.String value = param;
    if (main.ConstantManager.getInstance().getMap().keySet().contains(param.toUpperCase())) {
        value = main.ConstantManager.getInstance().getMap().get(param);
    }
    try {
        java.lang.Double.valueOf(value);
    } catch (java.lang.NumberFormatException nfe) {
        java.lang.System.out.println((("Your Input was: " + value) + "This Constant is not support in your Product."));
    }
    return value;
}