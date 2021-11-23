@java.lang.Override
public void onClick(android.view.View v) {
    isLogin = !(isLogin);
    if (isLogin) {
        btn_login_register.setImageResource(R.drawable.btn_signin);
        tv_switch.setText("Don't have an account yet?");
    }else {
        btn_login_register.setImageResource(R.drawable.register);
        tv_switch.setText("Already have an account?");
    }
}