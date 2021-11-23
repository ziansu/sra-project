@java.lang.Override
protected void onCreate(@android.support.annotation.Nullable
android.os.Bundle savedInstanceState) {
    initTheme();
    initTaskDescription();
    super.onCreate(savedInstanceState);
    mFragmentManagerHelper = new com.ebnbin.ebapplication.base.FragmentManagerHelper(getFragmentManager(), android.R.id.content);
}