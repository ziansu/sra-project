public static java.lang.String formateDate(int day, int month, int year) {
    java.lang.String formatedDate = "";
    java.lang.String formatedDay = "";
    java.lang.String formatedMonth = "";
    if (day < 10)
        formatedDay = "0" + day;
    else
        formatedDay = "" + day;
    
    if (month < 10)
        formatedMonth = "0" + (month + 1);
    else
        formatedMonth = "" + (month + 1);
    
    formatedDate = (((formatedDay + "/") + formatedMonth) + "/") + year;
    return formatedDate;
}