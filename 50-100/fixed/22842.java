@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    boolean isUserFirstTime = com.beehyv.findmissingchild.utilities.Utils.readSharedSetting(getApplicationContext(), Utils.PREFERENCES_FILE);
    android.content.Intent introIntent = new android.content.Intent(getApplicationContext(), com.beehyv.findmissingchild.activities.PagerActivity.class);
    introIntent.putExtra(Utils.PREFERENCES_FILE, isUserFirstTime);
    introIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
    if (isUserFirstTime) {
        startActivity(introIntent);
    }else {
        android.content.Intent intent = new android.content.Intent(this, com.beehyv.findmissingchild.activities.MainActivity.class);
        startActivity(intent);
    }
}