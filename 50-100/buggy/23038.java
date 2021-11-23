public static java.lang.String convertToColor(java.lang.String originalString, java.lang.String colorCode) {
    java.lang.String clearColor = originalString.replace("color='red'", (("color='" + colorCode) + "'"));
    java.lang.String result = ((("<font color='" + colorCode) + "'>") + clearColor) + "</font>";
    return result;
}