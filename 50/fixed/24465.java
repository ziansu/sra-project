@java.lang.Override
public void finish() {
    super.finish();
    overridePendingTransition(R.anim.abc_fade_in, R.anim.abc_slide_out_bottom);
}