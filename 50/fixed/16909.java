public void decreaseTime(android.view.View view) {
    if ((timeToGetReadyInMinutes) > 0) {
        timeToGetReadyInMinutes -= 5;
    }
    timeToGetReadyTextView.setText(java.lang.String.valueOf(timeToGetReadyInMinutes));
}