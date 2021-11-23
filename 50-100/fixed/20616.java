@java.lang.Override
public void onBackPressed() {
    if (((mDisplayedFragment) instanceof com.held.fragment.FeedFragment) && (mDisplayedFragment.isVisible())) {
        this.finishActivity(Activity.RESULT_OK);
        this.finish();
    }else {
        timber.log.Timber.d("Calling super.onbackpressed");
        super.onBackPressed();
    }
}