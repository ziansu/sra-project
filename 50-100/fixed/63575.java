@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    if (task.isSuccessful()) {
        android.widget.Toast.makeText(this, "Авторизация успешна", Toast.LENGTH_SHORT).show();
        android.content.Intent intent = new android.content.Intent(this, com.gorovoii.vitalii.fbdb.activity.MainActivity.class);
        startActivity(intent);
    }else {
        android.widget.Toast.makeText(this, "Авторизация провалена", Toast.LENGTH_SHORT).show();
    }
}