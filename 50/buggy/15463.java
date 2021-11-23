@java.lang.Override
public void notifySuccessful() {
    android.widget.Toast.makeText(this.context, ((this.firstnameEditText) + (getString(R.string.user_registered_notify_message))), Toast.LENGTH_SHORT).show();
}