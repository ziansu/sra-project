@java.lang.Override
public void onClick(android.view.View v) {
    android.widget.Toast.makeText(getApplicationContext(), ((com.videodesk.eshopdemoapp.DataHolder.getInstance().getProduct(toRemove)[0]) + " has been removed from your cart."), Toast.LENGTH_LONG).show();
    com.videodesk.eshopdemoapp.DataHolder.getInstance().removeFromCart(toRemove);
    android.content.Intent intent = getIntent();
    finish();
    startActivity(intent);
}