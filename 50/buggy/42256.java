@java.lang.Override
public void onSelect(java.lang.String text) {
    android.widget.Toast.makeText(this, ("Level " + text), Toast.LENGTH_SHORT).show();
    int level = java.lang.Integer.parseInt(text);
    com.example.zieng.gl3dosmos.Level.setLevel(level);
}