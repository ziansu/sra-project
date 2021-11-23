@java.lang.Override
public void run() {
    android.widget.Toast.makeText(this, "Error getting profile", Toast.LENGTH_SHORT).show();
    android.util.Log.e("ProfileFragment", e.getMessage());
    e.printStackTrace();
}