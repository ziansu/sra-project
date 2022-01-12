public void addTime(int hour, int minute) {
    de.privat.ciupka.schedule.logic.schedule.Time time = new de.privat.ciupka.schedule.logic.schedule.Time();
    if (time.setTime(hour, minute)) {
        this.times.add(time);
    }
}