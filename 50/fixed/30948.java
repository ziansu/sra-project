@java.lang.Override
public void onClick(android.view.View v) {
    j = new android.content.Intent(this, com.example.sweng.seiqol_app.PieTesting.class);
    j.putExtra("DATA", data);
    startActivity(j);
}