private int calculateRows(java.util.ArrayList<Kubaner.Logic.Time[]> startTimeList) {
    int rows = 1;
    Kubaner.Logic.Time time = null;
    do {
        time = getNextStartTime(time, startTimeList);
        if (time != null)
            rows++;
        
    } while (time != null );
    return rows;
}