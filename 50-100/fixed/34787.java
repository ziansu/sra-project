@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String strUserName = editTextUserName.getText().toString();
    java.lang.String strPassWord = editTextPassword.getText().toString();
    android.content.Intent intent = new android.content.Intent(this, com.example.myapplication.activity.ChooseAreaActivity.class);
    startActivity(intent);
}