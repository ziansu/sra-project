@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int which) {
    java.lang.String idInput = input.getText().toString();
    java.lang.System.out.println((((ListElementsArrayList.get(timeTapped)) + " ") + idInput));
    com.google.firebase.database.FirebaseDatabase database = com.google.firebase.database.FirebaseDatabase.getInstance();
    com.google.firebase.database.DatabaseReference myRef = database.getReference((("/5kRace/" + idInput) + "/Time"));
    myRef.setValue(ListElementsArrayList.get(timeTapped));
}