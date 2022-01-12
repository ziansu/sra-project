@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String strUserName = editTextUserName.getText().toString();
    java.lang.String strPassWord = editTextPassword.getText().toString();
    if (((strUserName.compareTo("app")) == 0) && ((strPassWord.compareTo("123456")) == 0)) {
        android.content.Intent intent = new android.content.Intent(this, com.example.myapplication.activity.ChooseAreaActivity.class);
        startActivity(intent);
    }
}