@java.lang.Override
public void onReady(java.lang.Object val) {
    if (((boolean) (val))) {
        action.start();
        map.put(action.uuid, action);
        set.add(action.uuid);
    }
}