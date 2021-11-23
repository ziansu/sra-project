@java.lang.Override
public void onClick(android.view.View view) {
    if ((((lastCheckedRB) != null) && ((parent.getChildCount()) != 1)) && (view != (lastCheckedRB))) {
        lastCheckedRB.setChecked(false);
    }
    lastCheckedRB = ((android.widget.RadioButton) (view));
    selectedButtonPos = position;
}