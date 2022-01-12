@java.lang.Override
public void onClick(android.view.View v) {
    java.lang.String username = ((android.widget.EditText) (findViewById(R.id.username))).getText().toString();
    android.content.Intent mIntent;
    switch (v.getId()) {
        case R.id.loginButton :
            mIntent = new android.content.Intent(this, com.myos.myos.Salon.class);
            mIntent.putExtra("username", username);
            startActivity(mIntent);
            break;
        case R.id.signupButton :
            break;
        default :
            break;
    }
}