@java.lang.Override
public void onCreate() {
    super.onCreate();
    toast = new android.widget.Toast(this);
    toast.setDuration(Toast.LENGTH_SHORT);
    handler = new android.os.Handler();
    showMessage("Service created");
}