public void onTabUnselected(android.app.ActionBar.Tab tab, android.app.FragmentTransaction ft) {
    sg.edu.ntu.sce.fyp.calevent.model.DataManager dataMgr = sg.edu.ntu.sce.fyp.calevent.model.DataManager.getInstance();
    for (sg.edu.ntu.sce.fyp.calevent.model.myclass.MyEvent ev : dataMgr.getAcceptedEventList()) {
        ev.setAccepted(false);
    }
    mActivity.caleventHelper.addNewEventsToCalendar(dataMgr.getAcceptedEventList(), sg.edu.ntu.sce.fyp.calevent.global.Settings.getInstance().getWriteCalendarId());
    dataMgr.getAcceptedEventList().clear();
    if (dataMgr != null) {
        dataMgr.setTimeSlotList(null);
    }
}