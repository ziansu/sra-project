@java.lang.Override
public void onClick(android.view.View v) {
    if (!(com.flaredown.flaredownApp.Checkin.CheckinActivity.isLoadingCheckIn.getValue())) {
        java.util.Calendar c = ((java.util.Calendar) (com.flaredown.flaredownApp.Checkin.CheckinActivity.checkIn.getValue().getDate().clone()));
        c.add(java.util.Calendar.DATE, (-1));
        displayCheckin(c);
    }
}