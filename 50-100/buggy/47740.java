@java.lang.SuppressWarnings(value = "deprecation")
@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
    android.widget.RelativeLayout rl = ((android.widget.RelativeLayout) (findViewById(R.id.layout)));
    if (keyCode == (android.view.KeyEvent.KEYCODE_BACK)) {
        rl.setBackgroundResource(R.drawable.flashlight1);
        v1.setVisibility(View.VISIBLE);
        v2.setVisibility(View.INVISIBLE);
        if ((cam) != null)
            cam.release();
        
    }
    return super.onKeyDown(keyCode, event);
}