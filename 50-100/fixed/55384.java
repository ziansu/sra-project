@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    if (task.isSuccessful()) {
        android.widget.Toast.makeText(getApplicationContext(), "Successfully Registered User moving to Profile Page", Toast.LENGTH_LONG).show();
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "Failed to Register User, Something went wrong", Toast.LENGTH_LONG).show();
        return ;
    }
}