private java.lang.String correctDate(java.lang.String uncDate) {
    java.lang.String[] splitDate = uncDate.split("/");
    java.lang.String day = splitDate[0];
    java.lang.String month = splitDate[1];
    java.lang.String year = splitDate[2];
    return (((year + "-") + month) + "-") + day;
}