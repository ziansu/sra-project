@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case android.R.attr.id.llay1 :
            android.support.design.widget.Snackbar snackbar = android.support.design.widget.Snackbar.make(coordinatorLayout, "NFC Enabled", Snackbar.LENGTH_SHORT);
            snackbar.show();
            scanTypeFlag = 1;
            break;
        case android.R.attr.id.llay2 :
            scanTypeFlag = 2;
            openFrag(1, true);
            break;
        case android.R.attr.id.llay3 :
            scanTypeFlag = 3;
            openFrag(1, true);
            break;
        case android.R.attr.id.cart_img :
            openFrag(2, false);
            break;
    }
}