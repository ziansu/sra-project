public void setTimerView(long secUntilFinished) {
    java.lang.String sec = java.lang.String.format("%02d", ((secUntilFinished / 1000) % 60));
    java.lang.String min = java.lang.String.format("%02d", ((secUntilFinished / 1000) / 60));
    textViewText = (min + ":") + sec;
    textView.setText(textViewText);
    progressBar.setProgress(((int) ((secUntilFinished * 1000) / (default_StudyTime))));
}