@java.lang.Override
public void afterDelivered(int smsId) {
    android.widget.Toast.makeText(this, "afterDelivered!", Toast.LENGTH_SHORT).show();
}