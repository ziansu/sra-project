private void navigateTo(java.lang.Class<? extends org.gdg.frisbee.android.common.GdgActivity> activityClass, android.os.Bundle additional) {
    if ((this.getClass().equals(activityClass)) && (!((this) instanceof org.gdg.frisbee.android.eventseries.TaggedEventSeriesActivity))) {
        return ;
    }
    android.content.Intent i = new android.content.Intent(this, activityClass);
    i.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
    if (additional != null) {
        i.putExtras(additional);
    }
    startActivity(i);
    mDrawerLayout.closeDrawers();
}