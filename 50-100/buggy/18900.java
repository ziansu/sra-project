@java.lang.Override
public void onClick(android.view.View v) {
    com.google.android.gms.analytics.HitBuilders.EventBuilder eventBuilder = new com.google.android.gms.analytics.HitBuilders.EventBuilder().setCategory(GAUtils.Category.FLIGHT);
    final com.o3dr.android.client.Drone drone = getDrone();
    eventBuilder = null;
    switch (v.getId()) {
        case R.id.rcSwitch :
            if (mSwitch.isChecked()) {
                doStart();
            }else {
                doStop();
            }
            break;
        case R.id.refreshParamBtn :
            refreshParameters();
        default :
            eventBuilder = null;
            break;
    }
    if (eventBuilder != null) {
        org.droidplanner.android.utils.analytics.GAUtils.sendEvent(eventBuilder);
    }
}