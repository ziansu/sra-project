@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    de.greenrobot.event.EventBus.getDefault().register(this);
}