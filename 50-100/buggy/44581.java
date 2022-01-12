@java.lang.Override
public void onClick(android.view.View view) {
    if (((lastCheckedRB) != null) && ((parent.getChildCount()) != 1)) {
        lastCheckedRB.setChecked(false);
    }
    lastCheckedRB = ((android.widget.RadioButton) (view));
    selectedButtonPos = position;
}