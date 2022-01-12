public java.lang.String addDate(java.lang.String date, char typeRepeat) {
    switch (typeRepeat) {
        case 'D' :
            return this.addDayInDate(date);
        case 'M' :
            return this.addMonthInDate(date);
        case 'A' :
            return this.addYearInDate(date);
        default :
            return date;
    }
}