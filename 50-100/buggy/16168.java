@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        (checks)++;
        changeActionBar(checks, title);
        ticked.add(currentIteration);
    }else {
        (checks)--;
        changeActionBar(checks, title);
        ticked.remove(currentIteration);
    }
}