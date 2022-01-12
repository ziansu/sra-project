private static int getItemNumberIndicator(java.lang.String userArgs) {
    java.lang.String[] splitName = userArgs.split(".");
    int itemIndicator;
    if ((splitName.length) > 0) {
        try {
            itemIndicator = (java.lang.Integer.getInteger(splitName[0])) - 1;
        } catch (java.lang.NumberFormatException nfe) {
            itemIndicator = 0;
        }
    }else {
        itemIndicator = 0;
    }
    return itemIndicator;
}