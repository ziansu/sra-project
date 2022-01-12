@java.lang.Override
public void onClick(android.view.View v) {
    if ((ir.geekhouse.yumbox.ViewPagerFragment.i) >= 1) {
        (ir.geekhouse.yumbox.ViewPagerFragment.i)--;
        java.lang.String price = (" قیمت : " + ((ir.geekhouse.yumbox.ViewPagerFragment.i) * 15)) + " تومان ";
        textViewPrice.setText(price);
        textViewQuantity.setText(((ir.geekhouse.yumbox.ViewPagerFragment.i) + " پرس "));
    }
}