@java.lang.Override
public void onCreate(android.os.Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    if ((getArguments()) != null) {
    }
    org.greenrobot.eventbus.EventBus.getDefault().register(this);
}