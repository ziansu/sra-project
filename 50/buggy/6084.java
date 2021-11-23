@java.lang.Override
public void onClick(android.view.View v) {
    submitCheckin();
    displaySummary();
    setView(com.flaredown.flaredownApp.Checkin.CheckinActivity.Views.SUMMARY);
}