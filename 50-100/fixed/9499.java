private boolean isRowEmpty(int startingPosition) {
    int i = startingPosition;
    while (i >= 0) {
        if ((i % (com.kiddos.nuktimetable.MainFragment.ScheduleAdapter.NUM_COL)) == 0)
            break;
        
        i--;
    } 
    int start = i;
    for (; i < (start + (com.kiddos.nuktimetable.MainFragment.ScheduleAdapter.NUM_COL)); i++) {
        if ((courses[i]) != null) {
            return false;
        }
    }
    return true;
}