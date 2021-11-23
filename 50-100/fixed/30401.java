public void done(com.avos.avoscloud.AVUser user, com.avos.avoscloud.AVException e) {
    if ((e == null) && (user != null)) {
        android.widget.Toast.makeText(getApplicationContext(), "登陆成功!", Toast.LENGTH_SHORT).show();
        show_main_screen();
    }else {
        android.widget.Toast.makeText(getApplicationContext(), "登陆失败,请检查账户或网络!", Toast.LENGTH_SHORT).show();
    }
}