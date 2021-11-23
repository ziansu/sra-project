@butterknife.OnClick(value = { R.id.btn_enter_login , R.id.btn_register_login })
public void onViewClicked(android.view.View view) {
    switch (view.getId()) {
        case R.id.btn_enter_login :
            java.lang.String email = etEmailLogin.getText().toString();
            java.lang.String password = etPasswordLogin.getText().toString();
            presenter.login(email, password);
            break;
        case R.id.btn_register_login :
            registerClicked();
            break;
    }
}