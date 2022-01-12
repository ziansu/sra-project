@java.lang.Override
public void onClick(android.view.View view) {
    com.jayway.alphabet.tracking.FirebaseTracker.getInstance().send(("REGISTRATION_ON_FIELD_CLICKED_" + (view.getTag())));
}