public java.lang.String convertFromEuropeanToAmericanDateFormat(java.lang.String europeanDate) {
    java.lang.String americanDate = ((((((europeanDate.substring(6, 10)) + "-") + (europeanDate.substring(3, 5))) + "-") + (europeanDate.substring(0, 2))) + " ") + (europeanDate.substring(11, 16));
    americanDate = americanDate + ":00";
    return americanDate;
}