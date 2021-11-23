@java.lang.Override
public void run() {
    com.epicodus.shakeitup.MainActivity.loadingDialog.hide();
    android.widget.Toast.makeText(this, "Oops, that address doesn't work!", Toast.LENGTH_LONG).show();
    locationLabel.setText("");
    locationLabel.setHint("Please try again!");
}