@java.lang.Override
public void onClick(android.view.View v) {
    int id = v.getId();
    if (id == (R.id.toggleButton)) {
        switch (timerToggle) {
            case SHOULD_START :
                startCountdown();
                timerSetSeekBar.setVisibility(View.INVISIBLE);
                timerToggle = com.mohammedsazid.android.done.MainActivity.PlaceholderFragment.TimerToggle.SHOULD_STOP;
                break;
            case SHOULD_STOP :
                cancelCountdown(true);
                timerSetSeekBar.setVisibility(View.VISIBLE);
                timerToggle = com.mohammedsazid.android.done.MainActivity.PlaceholderFragment.TimerToggle.SHOULD_START;
                break;
        }
    }
}