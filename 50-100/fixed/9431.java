@java.lang.Override
public void onAuthStateChanged(@android.support.annotation.NonNull
com.google.firebase.auth.FirebaseAuth firebaseAuth) {
    com.google.firebase.auth.FirebaseUser user = firebaseAuth.getCurrentUser();
    if (user != null) {
        if (LOGGING) {
            it.uniba.di.ivu.sms16.gruppo3.fasterfood.AppConfiguration.setLogged(true);
            it.uniba.di.ivu.sms16.gruppo3.fasterfood.AppConfiguration.setUser(user.getEmail());
            android.support.design.widget.Snackbar.make(getView(), getResources().getString(R.string.logged_in), Snackbar.LENGTH_LONG).show();
            activity.checkLogged();
            LOGGING = false;
            activity.onBackPressed();
        }else {
            activity.onBackPressed();
        }
    }
}