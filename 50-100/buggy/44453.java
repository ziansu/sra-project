@java.lang.Override
public void onClick(android.view.View view) {
    android.widget.LinearLayout pickupDateLayout = ((android.widget.LinearLayout) (findViewById(R.id.pickupDateContainer)));
    android.widget.EditText pickupDate = ((android.widget.EditText) (pickupDateLayout.findViewById(R.id.pickupDate)));
    if ((pickupDate.getText().toString().length()) == 0) {
        pickupDate.setText("23-05-2015");
    }
    dialog.dismiss();
}