public void updateTextView() {
    int volume = soundDb();
    if (volume > (highestVolume)) {
        highValueTextView.setText((volume + " dB"));
        highestVolume = volume;
    }
    if ((volume < (lowestVolume)) || ((lowestVolume) < 0)) {
        lowValueTextView.setText((volume + " dB"));
        lowestVolume = volume;
    }
    currentValueTextView.setText((volume + " dB"));
    currentVolume = volume;
}