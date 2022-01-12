@java.lang.Override
public void onBackPressed() {
    if (mBackPressed) {
        super.onBackPressed();
    }else {
        mBackPressed = true;
        mHandler.postDelayed(mCancelExit, 2000);
        android.support.design.widget.Snackbar.make(findViewById(R.id.task_list_activity_container), getString(R.string.press_back_again_to_exit), Snackbar.LENGTH_SHORT).show();
    }
}