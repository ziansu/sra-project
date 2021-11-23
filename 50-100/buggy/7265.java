public java.lang.String addDate(java.lang.String date, char typeRepeat) {
    br.com.inmypocket.controllers.DateCTR dateCTR = new br.com.inmypocket.controllers.DateCTR();
    switch (typeRepeat) {
        case 'D' :
            return dateCTR.addDayInDate(date);
        case 'M' :
            return dateCTR.addMonthInDate(date);
        case 'A' :
            return dateCTR.addYearInDate(date);
        default :
            return date;
    }
}