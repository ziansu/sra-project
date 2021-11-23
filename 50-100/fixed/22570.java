@java.lang.Override
public void onClick(android.view.View v) {
    if (isAuthenticated(username.getText().toString().trim(), pass.getText().toString().trim())) {
        android.content.Intent homePageIntent = new android.content.Intent(this, takeyourseat.activities.HomePageActivity.class);
        this.startActivity(homePageIntent);
        error.setText("");
    }else {
        error.setText("Incorrect username and/or password.");
    }
}