@java.lang.Override
public void onClick(android.view.View v) {
    if (menuOnlineDatabase.checkUsername(txtUsernameRegister.getText().toString())) {
        menuOnlineDatabase.insertUser(txtUsernameRegister.getText().toString(), txtPasswordRegister.getText().toString());
        android.widget.Toast.makeText(this, "Dang ky thanh cong", Toast.LENGTH_SHORT);
    }else
        android.widget.Toast.makeText(this, "Username da ton tai", Toast.LENGTH_SHORT).show();
    
}