@java.lang.Override
public void showMessage(java.lang.String message) {
    if ((getContext()) != null) {
        android.widget.Toast.makeText(getContext(), message, Toast.LENGTH_SHORT).show();
    }
}