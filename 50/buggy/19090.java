@java.lang.Override
public void getDrawable(android.graphics.drawable.Drawable drawable, java.lang.Object name, java.io.File file) {
    android.widget.Toast.makeText(getApplicationContext(), ("" + name), Toast.LENGTH_SHORT).show();
    android.util.Log.e("name--> ", ("" + name));
}