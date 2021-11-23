@java.lang.Override
public void onBackPressed() {
    super.onBackPressed();
    finish();
    overridePendingTransition(R.anim.anim_right_in, R.anim.anim_right_out);
}