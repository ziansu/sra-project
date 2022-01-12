private de.hof.university.app.model.schedule.Changes getChanges(final android.content.Context context) {
    if ((this.changes) == null) {
        java.lang.Object obtChangesObj = de.hof.university.app.data.DataManager.readObject(context, Define.changesFilename);
        if ((obtChangesObj != null) && (obtChangesObj instanceof de.hof.university.app.model.schedule.Changes)) {
            this.changes = ((de.hof.university.app.model.schedule.Changes) (obtChangesObj));
        }else {
            this.changes = new de.hof.university.app.model.schedule.Changes();
        }
    }
    return this.changes;
}