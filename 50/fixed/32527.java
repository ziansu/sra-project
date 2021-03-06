@java.lang.Override
public void onSupportActionModeStarted(com.mkulesh.micromath.ActionMode mode) {
    super.onSupportActionModeStarted(mode);
    activeActionModes.add(mode);
    final com.mkulesh.micromath.BaseFragment f = getVisibleFragment();
    if (f != null) {
        f.updateModeTitle();
    }
}