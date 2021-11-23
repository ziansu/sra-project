@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String grabbedString = input.getText().toString();
    listItems.get(pos).setText(grabbedString);
    adapter.notifyDataSetChanged();
}