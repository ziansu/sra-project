@java.lang.Override
public void onCompleted() {
    menuItemSignIn.setEnabled(true);
    mProgressDialog.dismiss();
    io.github.ryanhoo.firFlight.analytics.FlightAnalytics.onEvent(new io.github.ryanhoo.firFlight.analytics.FlightEvent(io.github.ryanhoo.firFlight.analytics.FlightEvent.EVENT_SIGN_IN).putCustomAttribute(FlightEvent.KEY_EMAIL, email).putSuccess(true));
    startActivity(new android.content.Intent(this, io.github.ryanhoo.firFlight.ui.main.MainActivity.class));
    finish();
}