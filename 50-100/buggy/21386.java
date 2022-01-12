@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String[] values = new java.lang.String[edittexts.size()];
    android.util.Log.d("SLOT_FILLING", java.lang.String.valueOf(values.length));
    for (int i = 0; i < (edittexts.size()); i++) {
        values[i] = edittexts.get(i).getText().toString();
    }
    owner.onSlotFillingActivated(msg.title, msg.json, values);
}