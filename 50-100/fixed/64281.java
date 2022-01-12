@java.lang.Override
public void onClick(android.view.View v) {
    com.videodesk.eshopdemoapp.DataHolder.getInstance().setCart(getProduct());
    android.widget.Toast.makeText(getApplicationContext(), ((getProductInfo(0)) + " has been added to your cart!"), Toast.LENGTH_LONG).show();
    finish();
}