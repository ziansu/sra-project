private void initViews() {
    mSharedPreferences = getSharedPreferences(com.example.framgia.carobluetooth.ui.activity.SHARED_PREFERENCES, Context.MODE_PRIVATE);
    mEditor = mSharedPreferences.edit();
    mCheckBoxBlockTwoHeadWin = ((android.widget.CheckBox) (findViewById(R.id.checkbox_block_two_head_win)));
    mCheckBoxSound = ((android.widget.CheckBox) (findViewById(R.id.checkbox_sound)));
    mCheckBoxBlockTwoHeadWin.setChecked(mSharedPreferences.getBoolean(com.example.framgia.carobluetooth.ui.activity.BLOCK_TWO_HEAD_WIN, false));
    mCheckBoxSound.setChecked(mSharedPreferences.getBoolean(com.example.framgia.carobluetooth.ui.activity.SOUND, true));
}