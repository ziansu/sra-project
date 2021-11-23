@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    task = new com.commonsware.android.constants.ConstantsBrowser.LoadCursorTask();
    task.execute();
}