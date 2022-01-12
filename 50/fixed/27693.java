@java.lang.Override
public void onClick(android.view.View view) {
    switch (view.getId()) {
        case R.id.buttonLogin :
            handleLogin(getUserManager().login("", ""));
            break;
    }
}