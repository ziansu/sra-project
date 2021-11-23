@java.lang.Override
protected void onPostExecute(java.util.ArrayList<pl.edu.amu.wmi.wmitimetable.model.Meeting> meetings) {
    super.onPostExecute(meetings);
    pl.edu.amu.wmi.wmitimetable.model.World.getInstance().setMeetings(meetings);
}