@java.lang.Override
public void run() {
    btControl.setVisibility(View.INVISIBLE);
    btCancel.setVisibility(View.INVISIBLE);
    tv4.setText("download4");
    tv4.setClickable(true);
    android.widget.Toast.makeText(getApplicationContext(), "onCancel", Toast.LENGTH_LONG).show();
}