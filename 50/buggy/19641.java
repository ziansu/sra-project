@java.lang.Override
protected void onPause() {
    super.onPause();
    android.widget.ImageButton pause_button = ((android.widget.ImageButton) (findViewById(R.id.button_pause)));
    pause_button.setImageResource(R.drawable.resume);
    controller.stop();
}