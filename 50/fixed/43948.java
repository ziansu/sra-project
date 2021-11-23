public int getDate(int startDate) {
    if (startDate == 0)
        return 0;
    
    return model.MyDate.verschoben(startDate, daysSince);
}