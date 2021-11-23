@com.squareup.otto.Subscribe
public void onAuthSuccess(cz.kovar.petr.homevoice.bus.events.AuthEvent.Success event) {
    android.util.Log.v(cz.kovar.petr.homevoice.frontend.FragmentPlan.LOG_TAG, "Auth Success!");
    createButtons(dataContext.getLocationsNames());
}