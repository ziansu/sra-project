@java.lang.Override
public void onFailure(@android.support.annotation.NonNull
java.lang.Exception e) {
    android.widget.Toast.makeText(getApplicationContext(), e.getMessage(), Toast.LENGTH_SHORT).show();
}