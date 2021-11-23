@java.lang.Override
public void onReceive(android.content.Context context, android.content.Intent intent) {
    if (!(intent.getExtras().getBoolean("isFinished"))) {
        updateProgressIndicators();
    }else {
        playButtonActionToggle = com.example.scott.speaksteps.Constants.BUTTON_TOGGLE_RESET;
        com.example.scott.speaksteps.BaseApplication.getInstance().getAppPrefs().edit().putInt(Constants.BUTTON_TOGGLE, com.example.scott.speaksteps.Constants.BUTTON_TOGGLE_RESET).apply();
        binding.buttonPlay.setImageResource(R.drawable.ic_reset);
        stopRoutineService();
    }
}