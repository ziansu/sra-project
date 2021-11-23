public static void updateSeekBarOnProgress() {
    com.byteshaft.streamsound.MainActivity mainActivity = com.byteshaft.streamsound.MainActivity.getInstance();
    if (mainActivity != null) {
        mainActivity.seekBar.setProgress(((mainActivity.seekBar.getProgress()) + ((mainActivity.updateValue) / 2)));
        mainActivity.timeTextView.setText(com.byteshaft.streamsound.UpdateUiHelpers.secondToMinutes(((mainActivity.seekBar.getProgress()) + ((mainActivity.updateValue) / 2))));
    }
}