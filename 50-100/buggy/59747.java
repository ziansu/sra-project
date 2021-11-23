@java.lang.Override
public void onClick(android.view.View view) {
    java.lang.String groupId = groupName.getText().toString();
    if (checkAlreadyadded(groupId)) {
        android.widget.Toast.makeText(this, "Already added to this group", Toast.LENGTH_SHORT).show();
    }else {
        checkAndInFirebase(groupId);
        groupName.setText("");
    }
}