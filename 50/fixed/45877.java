@java.lang.Override
public void onClick(android.view.View view) {
    stop();
    startActivityForResult(new android.content.Intent(this, com.entersnowman.alarmclock.ListOfRingtonesActivity.class), com.entersnowman.alarmclock.MusicSettingsActivity.LIST_OF_RINGTONES);
}