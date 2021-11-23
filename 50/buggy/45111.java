@java.lang.Override
public void stateChanged(org.apache.pivot.wtk.Button button, org.apache.pivot.wtk.Button.State state) {
    pref.putBoolean(lastSelectId, button.isSelected());
}