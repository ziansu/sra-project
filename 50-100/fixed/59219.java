private void navigateTo(java.lang.Class<? extends org.gdg.frisbee.android.common.GdgActivity> activityClass, @android.support.annotation.Nullable
android.os.Bundle additional) {
    if ((this.getClass().equals(activityClass)) && (!((this) instanceof org.gdg.frisbee.android.eventseries.TaggedEventSeriesActivity))) {
        return ;
    }
    android.content.Intent intent = new android.content.Intent(this, activityClass);
    intent.addFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION);
    if (additional != null) {
        intent.putExtras(additional);
    }
    startActivity(intent);
    mDrawerLayout.closeDrawers();
}