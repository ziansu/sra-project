@java.lang.Override
public void run() {
    android.content.Intent homeIntent = new android.content.Intent(this, com.example.erikkjernlie.tdt4140project.Menu.class);
    startActivity(homeIntent);
    android.widget.Toast.makeText(this, "Successfully logged in!", Toast.LENGTH_SHORT).show();
    finish();
}