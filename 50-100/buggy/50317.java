@java.lang.Override
public void onComplete(@android.support.annotation.NonNull
com.google.android.gms.tasks.Task<com.google.firebase.auth.AuthResult> task) {
    android.util.Log.d(TAG, ("createUserWithEmail:onComplete:" + (task.isSuccessful())));
    progressBar.setVisibility(View.GONE);
    if (!(task.isSuccessful())) {
        android.widget.Toast.makeText(this, R.string.auth_failed, Toast.LENGTH_SHORT).show();
    }else {
        new com.example.shashank.splitbill.SharedPreferences.Preference(this).updatePassword(password);
        new com.example.shashank.splitbill.SharedPreferences.Preference(this).updatePersonName(name);
    }
}