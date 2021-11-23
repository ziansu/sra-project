private java.lang.String[] getAllelesArray(java.lang.String[] variationFeatureFields) {
    java.lang.String[] allelesArray = null;
    if ((variationFeatureFields != null) && ((variationFeatureFields[6]) != null)) {
        allelesArray = variationFeatureFields[6].split("/");
        if ((allelesArray.length) == 1) {
            allelesArray = null;
        }
    }
    return allelesArray;
}