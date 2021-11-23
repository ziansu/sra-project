private void initData() {
    mImm = ((android.view.inputmethod.InputMethodManager) (getActivity().getSystemService(Context.INPUT_METHOD_SERVICE)));
    mConfigPref = new com.fivetrue.workout.timer.preference.ConfigPreferenceManager(getActivity());
    mTimerData = new com.fivetrue.workout.timer.vo.TimerData();
    mTimerData.setAccount(mConfigPref.getAccount());
    mTimerData.setId(((mConfigPref.getAccount()) + (java.lang.System.currentTimeMillis())));
    mTimerData.setTimerMilliseconds(30000L);
}