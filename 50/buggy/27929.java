@java.lang.Override
protected void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    initData(savedInstanceState);
    initGUI();
    initApplicationLogic();
    initEventToListenerMapping();
}