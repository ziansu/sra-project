@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent i = new android.content.Intent(this, com.example.unzi.findalert.ui.AlertActivity.class);
    i.putExtra("knownLocation", true);
    i.putExtra("isInside", true);
    i.putExtra("Alert", a);
    android.widget.Toast.makeText(this, "ola", Toast.LENGTH_SHORT).show();
    startActivity(i);
}