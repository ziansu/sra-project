@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    overridePendingTransition(R.animator.pull_left, R.animator.push_right);
    safeDestroySR();
    finish();
}