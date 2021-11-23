@java.lang.Override
public void run() {
    android.widget.Toast.makeText(context, getString(R.string.slow_connectivity), Toast.LENGTH_LONG).show();
    tv_Gauge_TextView_PsuedoButton.setClickable(true);
}