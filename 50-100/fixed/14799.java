public void onSignIn(com.bingo.bingo.activities.View view) {
    if ((username.getText().toString().equals("bingo")) && (password.getText().toString().equals("bingo"))) {
        android.widget.Toast.makeText(this, "Login", Toast.LENGTH_LONG).show();
        android.content.Intent intent = new android.content.Intent(this, com.bingo.bingo.activities.MainActivity.class);
        startActivity(intent);
    }else {
        android.widget.Toast.makeText(this, "Invalid Username or Password", Toast.LENGTH_LONG).show();
    }
}