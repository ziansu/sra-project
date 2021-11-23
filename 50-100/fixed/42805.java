@java.lang.Override
public void onClick(android.view.View v) {
    handler.removeCallbacks(runnable);
    mSection = mEditTextSection.getText().toString();
    timestampLong = java.lang.System.currentTimeMillis();
    timestamp = (((mSection) + " - Canceled: ") + (timestampLong.toString())) + "\n\n";
    writeToFile(timestamp, getApplicationContext());
    mButtonStart.setVisibility(View.VISIBLE);
    mButtonStop.setVisibility(View.INVISIBLE);
}