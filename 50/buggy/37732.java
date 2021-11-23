@java.lang.Override
public android.view.View findViewById(@android.support.annotation.IdRes
int id) {
    android.view.View v = super.findViewById(id);
    if (v instanceof android.support.v7.widget.SwitchCompat) {
        return null;
    }
    return super.findViewById(id);
}