@java.lang.Override
public void consume(edu.hm.cs.bikebattle.app.modell.User input) {
    principal = input;
    userPhoto = android.net.Uri.parse(input.getFotoUri());
    android.util.Log.d(edu.hm.cs.bikebattle.app.activities.BaseActivity.TAG, principal.toString());
    refreshUserInfo();
}