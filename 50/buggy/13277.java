@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setDefaultTextValues(true);
    if (savedInstanceState == null) {
        savedInstanceState = getArguments();
    }
    restoreFromBundle(savedInstanceState);
}