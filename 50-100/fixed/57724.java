@java.lang.Override
public void onDataChange(com.firebase.client.DataSnapshot parent) {
    java.lang.String newTextView = "Our Pantry Items:\n";
    for (com.firebase.client.DataSnapshot child : parent.getChildren()) {
        newTextView += child.child("name").getValue();
        newTextView += "\n";
    }
    final android.widget.TextView textViewToChange = ((android.widget.TextView) (findViewById(R.id.textView5)));
    textViewToChange.setText(newTextView);
}