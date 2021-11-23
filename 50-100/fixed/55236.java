@java.lang.Override
public void onItemSelected(android.widget.AdapterView<?> parent, android.view.View view, int position, long id) {
    java.lang.String subChannel = spinSubChannel.getSelectedItem().toString();
    if (subChannel.equalsIgnoreCase("Sub channel")) {
        android.widget.Toast.makeText(context, "Please, select sub channel", Toast.LENGTH_SHORT).show();
    }
}