private de.hof.university.app.model.schedule.MySchedule getMySchedule(final android.content.Context context) {
    if ((this.mySchedule) == null) {
        java.lang.Object object = de.hof.university.app.data.DataManager.readObject(context, de.hof.university.app.data.DataManager.myScheduleFilename);
        if (object == null) {
            this.mySchedule = new de.hof.university.app.model.schedule.MySchedule();
        }else {
            this.mySchedule = ((de.hof.university.app.model.schedule.MySchedule) (object));
        }
    }
    return this.mySchedule;
}