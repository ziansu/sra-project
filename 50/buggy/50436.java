@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.lta_setAudio_btn :
            chooseAudio();
            break;
        case R.id.aa_save_alarm :
            startAlarm();
            break;
        default :
            super.onClick(v);
    }
}