public static void navigateToOnlineSearchFragment(android.app.Activity activity, java.lang.String programId, java.lang.String orgUnitId) {
    android.content.Intent intent = new android.content.Intent(activity, org.hisp.dhis.android.trackercapture.activities.HolderActivity.class);
    intent.putExtra(OnlineSearchFragment.EXTRA_PROGRAM, programId);
    intent.putExtra(OnlineSearchFragment.EXTRA_ORGUNIT, orgUnitId);
    intent.putExtra(org.hisp.dhis.android.trackercapture.activities.HolderActivity.ARG_TYPE, org.hisp.dhis.android.trackercapture.activities.HolderActivity.ARG_TYPE_ONLINESEARCHFRAGMENT);
    intent.setFlags(((intent.getFlags()) | (android.content.Intent.FLAG_ACTIVITY_NO_HISTORY)));
    activity.startActivity(intent);
}