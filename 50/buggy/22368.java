@java.lang.Override
public void onClick(android.view.View v) {
    placeBid();
    android.widget.Toast bidplaced = android.widget.Toast.makeText(getApplicationContext(), "Your bid has been placed", Toast.LENGTH_SHORT);
    bidplaced.show();
}