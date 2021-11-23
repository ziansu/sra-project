@java.lang.SuppressWarnings(value = "deprecation")
@java.lang.Override
public void onPause() {
    super.onPause();
    android.widget.RelativeLayout rl = ((android.widget.RelativeLayout) (findViewById(R.id.layout)));
    click = false;
    v1.setVisibility(View.INVISIBLE);
    v2.setVisibility(View.INVISIBLE);
    rl.setBackgroundResource(R.drawable.flashlight1);
    if ((cam) != null) {
        cam.release();
        cam = null;
    }
}