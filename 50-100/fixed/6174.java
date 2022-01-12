public void updateTextView() {
    int volume = soundDb();
    if (volume < 0)
        return ;
    
    if (volume > (highestVolume)) {
        highValueTextView.setText((volume + " dB"));
        highestVolume = volume;
    }
    if (volume < (lowestVolume)) {
        lowValueTextView.setText((volume + " dB"));
        lowestVolume = volume;
    }
    currentValueTextView.setText((volume + " dB"));
    currentVolume = volume;
}