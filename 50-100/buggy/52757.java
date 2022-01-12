public void onClick(android.view.View v) {
    int id = v.getId();
    switch (id) {
        case R.id.login_login_btn :
            android.content.Intent a = new android.content.Intent(this, com.example.jurian.tentamenp4.MainActivity.class);
            java.lang.System.out.println("Login Btn");
            break;
        case R.id.login_register_btn :
            android.content.Intent b = new android.content.Intent(this, com.example.jurian.tentamenp4.RegisterActivity.class);
            java.lang.System.out.println("Register Btn");
            startActivity(b);
    }
}