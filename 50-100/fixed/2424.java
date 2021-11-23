@java.lang.Override
public void run() {
    java.lang.System.out.println(sessionManager.checkLogin());
    if (sessionManager.checkLogin()) {
        android.content.Intent alreadyLoggedIn = new android.content.Intent(this, com.android.clockwork.view.activity.MainActivity.class);
        startActivity(alreadyLoggedIn);
    }else {
        android.content.Intent userLogIn = new android.content.Intent(this, com.android.clockwork.view.activity.PreludeActivity.class);
        startActivity(userLogIn);
    }
    finish();
}