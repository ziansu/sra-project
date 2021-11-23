@java.lang.Override
public void onDataChange(final com.google.firebase.database.DataSnapshot snapshot) {
    java.lang.System.out.println(("Hi " + (snapshot.getValue())));
    editText.setSummary(snapshot.getValue(java.lang.String.class));
}