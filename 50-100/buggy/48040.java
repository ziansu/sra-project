@java.lang.Override
protected void onPostExecute(java.lang.Void aVoid) {
    super.onPostExecute(aVoid);
    settingsFragment.setStateOfSettingsButtons(true);
    if ((mapFragment) != null) {
        mapFragment.startGPSTracker();
    }
    settingsFragment.readPrefCal();
    soundMeter = new com.phucphuong.noisesearch.Utilities.SoundMeter(handler, getActivity(), settingsFragment.calirationValue, settingsFragment.speedMode, prefix);
    soundMeter.thread.start();
    graphFragment.startChronometer();
}