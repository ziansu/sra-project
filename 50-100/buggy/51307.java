@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    if (!(task.isSuccessful())) {
        android.widget.Toast.makeText(this, "El Nombre de Usuario o Contraseña ingresada son incorrectos. Inténtelo de nuevo.", Toast.LENGTH_SHORT).show();
    }else
        if (task.isSuccessful()) {
            if ((com.google.firebase.database.FirebaseDatabase.getInstance()) == null) {
                com.google.firebase.database.FirebaseDatabase.getInstance().setPersistenceEnabled(true);
            }
            setAmbulanceNumber(ambulanceET.getText().toString());
            startActivity(intent);
            finish();
        }
    
}