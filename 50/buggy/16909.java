public void decreaseTime(android.view.View view) {
    timeToGetReadyInMinutes -= 5;
    timeToGetReadyTextView.setText(java.lang.String.valueOf(timeToGetReadyInMinutes));
}