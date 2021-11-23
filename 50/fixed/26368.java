static java.lang.String checkValidData(java.lang.String data) {
    java.lang.String tempData = data;
    if ((tempData == null) || ((tempData.length()) == 0)) {
        tempData = "NA";
    }
    return tempData;
}