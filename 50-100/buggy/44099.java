private static int getItemNumberIndicator(java.lang.String userArgs) {
    java.lang.String[] splitName = userArgs.split(".");
    int itemIndicator;
    try {
        itemIndicator = java.lang.Integer.getInteger(splitName[0]);
    } catch (java.lang.NumberFormatException nfe) {
        itemIndicator = 0;
    }
    return itemIndicator;
}