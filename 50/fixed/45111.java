@java.lang.Override
public void stateChanged(org.apache.pivot.wtk.Button button, org.apache.pivot.wtk.Button.State state) {
    if ((pref) != null) {
        pref.putBoolean(lastSelectId, button.isSelected());
    }
}