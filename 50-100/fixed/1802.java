@java.lang.Override
public boolean onCreateOptionsMenu(android.view.Menu menu) {
    getMenuInflater().inflate(R.menu.menu_card, menu);
    menu.findItem(R.id.action_edit).setVisible((!(isEditing)));
    menu.findItem(R.id.action_pin).setVisible((!(isEditing)));
    if ((Build.VERSION.SDK_INT) < 26) {
        menu.findItem(R.id.action_pin).setVisible(false);
    }
    return true;
}