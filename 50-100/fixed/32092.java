@java.lang.Override
public void onStop() {
    super.onStop();
    if ((plannerAdapter) != null) {
        android.content.SharedPreferences preferences = getActivity().getSharedPreferences(nl.mprog.glimp.work_out.Activities.MainActivity.PlannerFragment.PREFS_NAME, 0);
        android.content.SharedPreferences.Editor editor = preferences.edit();
        checkBoxState = plannerAdapter.getCheckBoxState();
        for (int i = 0; i < (nl.mprog.glimp.work_out.Activities.MainActivity.PlannerFragment.DAYS_OF_WEEK); i++) {
            editor.putBoolean(("checkBoxState" + i), checkBoxState[i]);
        }
        editor.apply();
    }
}