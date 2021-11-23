@java.lang.Override
public void onClick(android.view.View view) {
    android.util.Log.d("TEST", ("TAG" + (view.getTag())));
    com.jayway.alphabet.tracking.FirebaseTracker.getInstance().send(("REGISTRATION_ON_FIELD_CLICKED_" + (view.getTag())));
}