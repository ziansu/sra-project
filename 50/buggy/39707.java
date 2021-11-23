@java.lang.Override
public void handleBrowserSwitchIntent(android.content.Intent intent) {
    fragment.getActivity().startActivityForResult(new android.content.Intent(fragment.getActivity(), com.braintreepayments.api.BraintreeBrowserSwitchActivity.class).setFlags(Intent.FLAG_ACTIVITY_NO_ANIMATION).putExtra(BraintreeBrowserSwitchActivity.EXTRA_INTENT, intent), com.braintreepayments.api.PayPal.PAYPAL_AUTHORIZATION_REQUEST_CODE);
}