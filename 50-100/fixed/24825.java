public void clickedConnection(android.view.View view) {
    android.widget.CheckBox checkBox = ((android.widget.CheckBox) (findViewById(R.id.connectionCheck)));
    checkBox.toggle();
    if (checkBox.isChecked()) {
        android.widget.Toast.makeText(context, "You are connected to the database", Toast.LENGTH_SHORT).show();
    }else {
        android.widget.Toast.makeText(context, "You are not connected to the database", Toast.LENGTH_SHORT).show();
    }
}