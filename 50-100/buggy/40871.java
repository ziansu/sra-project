@java.lang.Override
public void onClick(android.view.View v) {
    com.frysoft.notifry.utils.DateSpan ds = new com.frysoft.notifry.utils.DateSpan(new com.frysoft.notifry.utils.Date(25, 7, 2016), new com.frysoft.notifry.utils.Date(27, 7, 2016));
    com.frysoft.notifry.data.TimetableEntry ent = com.frysoft.notifry.data.TimetableEntry.create(((byte) (0)), "Test-Entry-1", "This is the Description", ds, null);
}