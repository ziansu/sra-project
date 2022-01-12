private int calculateRows(java.util.ArrayList<Kubaner.Logic.Time[]> startTimeList, int assessorCount) {
    int rows = 1;
    Kubaner.Logic.Time time = null;
    do {
        time = getNextStartTime(time, startTimeList);
        if (time != null)
            rows++;
        
    } while (time != null );
    rows += assessorCount;
    return rows;
}