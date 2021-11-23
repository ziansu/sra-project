private void workoutComplete() {
    android.os.Bundle data = getIntent().getExtras();
    timeTextView.setText("0");
    title.setText("YOU'RE DONE!");
}