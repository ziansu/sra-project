@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    com.ryansteckler.nlpunbounce.helpers.ThemeHelper.onActivityCreateSetTheme(this.getActivity());
    if ((getArguments()) != null) {
        mTaskerMode = getArguments().getBoolean(com.ryansteckler.nlpunbounce.AlarmRegexFragment.ARG_TASKER_MODE);
    }
}