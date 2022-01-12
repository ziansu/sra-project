@java.lang.Override
public void onItemClick(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String selected = methods.get(position);
    android.widget.Toast.makeText(com.aucklanduni.p4p.KeypadFragment.ctx, selected, Toast.LENGTH_LONG).show();
    dialog.dismiss();
    keypad.setField(selected);
    printText();
    setItemAdapter(keypad.getNextItems(selected));
}