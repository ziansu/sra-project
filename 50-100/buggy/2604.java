public void checkingLevelClicked(android.view.View view) {
    android.os.Bundle args = new android.os.Bundle();
    args.putLong(activity.reading.ReadingActivity.VERSION_ID_PARAM, mChapter.getParent(getApplicationContext()).getParent(getApplicationContext()).uid);
    activity.reading.ReadingActivity.CheckingLevelFragment fragment = new activity.reading.ReadingActivity.CheckingLevelFragment();
    fragment.setArguments(args);
    android.support.v4.app.FragmentTransaction ft = getSupportFragmentManager().beginTransaction();
    fragment.show(ft, activity.reading.ReadingActivity.CHECKING_LEVEL_FRAGMENT_ID);
}