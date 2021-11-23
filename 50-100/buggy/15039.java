private void showHeadsetMsg() {
    final android.content.Context context = getApplicationContext();
    final int duration = android.widget.Toast.LENGTH_SHORT;
    final android.widget.Toast toast = android.widget.Toast.makeText(context, getString(R.string.headset_plug), duration);
    toast.setGravity(Gravity.CENTER, ((toast.getXOffset()) / 2), ((toast.getYOffset()) / 2));
    toast.show();
}