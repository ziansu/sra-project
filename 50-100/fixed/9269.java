public static int getValidThreshold(boolean isSelected, java.lang.String text) {
    int threshold = -1;
    if (isSelected) {
        java.lang.String thresholdText = text;
        if ((!(thresholdText.isEmpty())) && (java.util.regex.Pattern.matches("[0-9]+", thresholdText))) {
            threshold = java.lang.Integer.parseInt(text);
        }else {
            org.baderlab.csapps.socialnetwork.CytoscapeUtilities.notifyUser(("Illegal input for max threshold. Please specify a " + "valid threshold value. Threshold must be a positive integer."));
        }
    }
    return threshold;
}