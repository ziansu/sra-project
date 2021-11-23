@java.lang.Override
public void execute(com.facebook.react.uimanager.NativeViewHierarchyManager nativeViewHierarchyManager) {
    android.view.View view = nativeViewHierarchyManager.resolveView(rootTag);
    if (view instanceof net.mischneider.MSREventBridgeEventReceiver) {
        net.mischneider.MSREventBridgeEventReceiver receiver = ((net.mischneider.MSREventBridgeEventReceiver) (view.getParent()));
        receiver.onEvent(name, info);
        return ;
    }
    android.content.Context context = view.getContext();
    if (context instanceof net.mischneider.MSREventBridgeEventReceiver) {
        net.mischneider.MSREventBridgeEventReceiver receiver = ((net.mischneider.MSREventBridgeEventReceiver) (context));
        receiver.onEventCallback(name, info, callback);
    }
}