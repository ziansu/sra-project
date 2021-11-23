@java.lang.Override
public void notifySuccessful() {
    android.widget.Toast.makeText(getContext(), ((this.firstnameEditText.getText().toString()) + (getString(R.string.user_registered_notify_message))), Toast.LENGTH_SHORT).show();
}