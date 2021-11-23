@java.lang.Override
public void onClick(android.view.View v) {
    boolean state1 = mSwitchChatHeader.isChecked();
    mSwitchChatHeader.setChecked((!state1));
    android.content.SharedPreferences.Editor editor = getSharedPreferences(com.add.toeic.activity.MainActivity.PREF_NAME_LOCK_SCREEN, com.add.toeic.activity.MODE_PRIVATE).edit();
    editor.putBoolean(com.add.toeic.activity.MainActivity.CHATHEADER_IS_OPEN, (!state1));
    editor.apply();
    if (state1) {
        startService(new android.content.Intent(this, com.add.toeic.services.FloatingViewService.class));
    }else {
        stopService(new android.content.Intent(this, com.add.toeic.services.FloatingViewService.class));
    }
}