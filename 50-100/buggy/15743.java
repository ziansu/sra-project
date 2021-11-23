private int calculateRows(java.util.ArrayList<Kubaner.Logic.Time[]> startTimeList) {
    int rows = 1;
    Kubaner.Logic.Time time = new Kubaner.Logic.Time(startTime.getHour(), startTime.getMinute());
    if ((startTimeList.isEmpty()) == false)
        rows++;
    
    while (time != null) {
        time = getNextStartTime(time, startTimeList);
        if (time != null)
            rows++;
        
    } 
    return rows;
}