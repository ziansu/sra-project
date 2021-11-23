@java.lang.Override
public void onClick(android.view.View v) {
    android.content.Intent launchCheckout = new android.content.Intent(getContext(), com.application.melanieh.kk.ui.CheckoutActivity.class);
    startActivity(launchCheckout);
}