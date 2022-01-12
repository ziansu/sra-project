public void onNewItemButtonClick(android.view.View v) {
    android.widget.EditText et = ((android.widget.EditText) (v.getRootView().findViewById(R.id.new_item)));
    et.setText(firstChar);
    et.setSelection(et.getText().length());
    java.lang.String newItem = et.getText().toString();
    items.add(newItem);
    adapter.notifyDataSetChanged();
}