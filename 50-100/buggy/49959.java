@java.lang.Override
public boolean onKeyDown(int keyCode, android.view.KeyEvent e) {
    java.lang.Boolean result = null;
    for (com.bitlove.fetlife.view.activity.component.ActivityComponent activityComponent : activityComponentList) {
        java.lang.Boolean componentResult = activityComponent.onActivityKeyDown(this, keyCode, e);
        if (componentResult == null) {
            continue;
        }
        if (result == null) {
            result = componentResult;
            continue;
        }
        result |= componentResult;
    }
    if (result == null) {
        return super.onKeyDown(keyCode, e);
    }
    return result;
}