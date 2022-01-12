private int getMinutes(java.sql.Time time) {
    int minutes = 0;
    minutes += time.getMinutes();
    minutes += (time.getHours()) * 60;
    if ((time.getSeconds()) >= 30) {
        minutes++;
    }
    return minutes;
}