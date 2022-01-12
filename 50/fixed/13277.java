@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if (savedInstanceState == null) {
        savedInstanceState = getArguments();
    }
    restoreFromBundle(savedInstanceState);
    setDefaultTextValues();
}