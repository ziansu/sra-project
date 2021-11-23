@java.lang.Override
public void onBackPressed() {
    com.example.tonto.zees.ShowLavaLightActivity.isBack = true;
    super.onBackPressed();
    overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_fade_out);
}