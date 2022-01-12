@java.lang.Override
public void showNetworkError(java.io.IOException e) {
    android.widget.Toast.makeText(getContext(), java.lang.String.format("Network error: %s", e.getMessage()), Toast.LENGTH_SHORT).show();
}