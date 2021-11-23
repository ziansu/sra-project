@java.lang.Override
public void handleFault(com.backendless.exceptions.BackendlessFault fault) {
    android.util.Log.d("DEBUG", fault.getMessage());
    android.widget.Toast.makeText(this, fault.getMessage(), Toast.LENGTH_SHORT).show();
}