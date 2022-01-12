@java.lang.Override
public void afterTextChanged(android.text.Editable editable) {
    setKey(editable.toString(), false);
    if (getPrefs().getBoolean(Common.ENABLE_QUICK_UNLOCK, false)) {
        if (checkInput()) {
            de.Maxr1998.xposed.maxlock.util.Util.hideKeyboardFromWindow(getActivity(), this);
        }
    }
}