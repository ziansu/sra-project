@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    if (task.isSuccessful()) {
        itp341.rigdon.matthew.finalprojectrigdonmatthew.Student.setSharedStudent(student);
        android.content.Intent intent = new android.content.Intent(getApplicationContext(), itp341.rigdon.matthew.finalprojectrigdonmatthew.MainActivity.class);
        startActivity(intent);
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "Something went wrong when trying to create your account, please try again later", Toast.LENGTH_LONG).show();
    }
}