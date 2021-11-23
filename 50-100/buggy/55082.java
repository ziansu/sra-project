private java.lang.String getPercentage(double ratio) throws java.lang.Exception {
    java.lang.String returnVal = new java.lang.Double((100 * ratio)).toString();
    if ((returnVal.indexOf(".")) < 3) {
        returnVal = returnVal + "0";
    }
    return returnVal + "%";
}