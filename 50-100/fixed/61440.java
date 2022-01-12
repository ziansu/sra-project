private de.hof.university.app.model.schedule.MySchedule getMySchedule(final android.content.Context context) {
    if ((this.mySchedule) == null) {
        java.lang.Object object = de.hof.university.app.data.DataManager.readObject(context, de.hof.university.app.data.DataManager.myScheduleFilename);
        if ((object != null) && (object instanceof de.hof.university.app.model.schedule.MySchedule)) {
            this.mySchedule = ((de.hof.university.app.model.schedule.MySchedule) (object));
        }else {
            this.mySchedule = new de.hof.university.app.model.schedule.MySchedule();
        }
    }
    return this.mySchedule;
}