@java.lang.Override
protected void onSwiped(android.support.v7.widget.RecyclerView.ViewHolder viewHolder, int direction, int position, long id) {
    try {
        de.aw.klackreminder.gv.Reminder reminder = new de.aw.klackreminder.gv.Reminder(getContext(), id);
        reminder.delete(de.aw.klackreminder.database.DBHelper.getInstance());
    } catch (de.aw.awlib.gv.AWApplicationGeschaeftsObjekt e) {
        e.printStackTrace();
    }
}