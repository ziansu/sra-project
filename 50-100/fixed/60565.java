public java.lang.String getCurrentSSID() {
    java.lang.String[] output = org.area515.util.IOUtilities.executeNativeCommand(new java.lang.String[]{ "iwgetid" , "-r" }, null, ((java.lang.String) (null)));
    if ((output.length) > 0) {
        return output[0];
    }else {
        return null;
    }
}