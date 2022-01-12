public java.lang.String getDateAndTime(int startDate) {
    java.lang.String datum;
    java.lang.String uhrzeit = " k. A.";
    int date = model.MyDate.verschoben(startDate, ((daysSince) != (-1) ? daysSince : 0));
    datum = model.MyDate.datum(date);
    if ((time) != (-1))
        uhrzeit = model.MyDate.uhrzeit(time);
    
    return (datum + " ") + uhrzeit;
}