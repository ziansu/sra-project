@java.lang.Override
public void onStart() {
    super.onStart();
    menuButtons.collapse();
    android.content.SharedPreferences settings = getActivity().getSharedPreferences(getString(R.string.PREFERENCE_FILE_KEY), 0);
    isToSum = settings.getBoolean("isToSum", true);
    updateFieldActivity();
}