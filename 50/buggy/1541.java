@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(this, ("Note " + (v.getId())), Toast.LENGTH_SHORT).show();
}