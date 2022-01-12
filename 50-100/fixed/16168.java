@java.lang.Override
public void onCheckedChanged(android.widget.CompoundButton buttonView, boolean isChecked) {
    if (isChecked) {
        (checks)++;
        changeActionBar(checks, title);
        ticked.add(currentIteration);
    }else {
        (checks)--;
        changeActionBar(checks, title);
        for (int j = 0; j < (ticked.size()); j++) {
            if (ticked.get(j).equals(currentIteration)) {
                ticked.remove(j);
            }
        }
    }
}