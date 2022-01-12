private de.hof.university.app.model.schedule.Schedule getSchedule(final android.content.Context context) {
    if ((this.schedule) == null) {
        java.lang.Object optScheduleObj = de.hof.university.app.data.DataManager.readObject(context, Define.scheduleFilename);
        if (optScheduleObj != null) {
            this.schedule = ((de.hof.university.app.model.schedule.Schedule) (optScheduleObj));
        }else {
            this.schedule = new de.hof.university.app.model.schedule.Schedule();
        }
    }
    return this.schedule;
}