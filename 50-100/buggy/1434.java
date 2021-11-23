@java.lang.Override
public void onClick(android.view.View v) {
    if (isLogin) {
        isLogin = false;
        btn_login_register.setImageResource(R.drawable.btn_signin);
        tv_switch.setText("Already have an account?");
    }else {
        isLogin = true;
        btn_login_register.setImageResource(R.drawable.register);
        tv_switch.setText("Don't have an account yet?");
    }
}