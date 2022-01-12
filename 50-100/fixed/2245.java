@java.lang.Override
public void onClick(android.view.View v) {
    if ((i) >= 1) {
        (i)--;
        java.lang.String price = (" قیمت : " + ((i) * 15)) + " تومان ";
        textViewPrice.setText(price);
        textViewQuantity.setText(((i) + " پرس "));
    }
}