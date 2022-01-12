@java.lang.Override
public void onClick(android.view.View view) {
    com.example.henry.homework1.chat.database = com.google.firebase.database.FirebaseDatabase.getInstance();
    com.example.henry.homework1.chat.ref = com.example.henry.homework1.chat.database.getReference();
    com.example.henry.homework1.chat.ref.child("hello world").push();
    com.example.henry.homework1.chat.ref.child("BABY").push();
    android.widget.Toast.makeText(getBaseContext(), "fas", Toast.LENGTH_LONG).show();
    android.support.design.widget.Snackbar.make(view, "SNACKBAR? IS THIS YOU????", Snackbar.LENGTH_LONG).setAction("Action", null).show();
}