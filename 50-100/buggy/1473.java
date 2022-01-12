public void onClick(android.view.View v) {
    android.widget.Toast T = android.widget.Toast.makeText(getApplicationContext(), "-Powered by Technotronic", Toast.LENGTH_SHORT);
    T.setGravity(((android.view.Gravity.BOTTOM) | (android.view.Gravity.END)), 0, 0);
    T.show();
    android.content.Intent i = new android.content.Intent(getApplicationContext(), com.technotronics.priceconverter.ReverseBilling.class);
    startActivity(i);
}