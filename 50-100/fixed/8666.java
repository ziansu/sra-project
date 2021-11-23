private boolean updateVisibilityCheck(boolean visible, com.android.internal.util.cm.LockscreenShortcutsHelper.Shortcuts shortcut) {
    boolean customTarget = mShortcutHelper.isTargetCustom(shortcut);
    if (customTarget) {
        boolean isEmpty = mShortcutHelper.isTargetEmpty(shortcut);
        if (isEmpty) {
            visible = false;
        }else {
            visible = true;
        }
    }
    return visible;
}