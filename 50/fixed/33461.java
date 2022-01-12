@java.lang.Override
public void onClick(android.view.View v) {
    dialogOnAddButtonPressed();
    mTracker.send(new com.google.android.gms.analytics.HitBuilders.EventBuilder().setCategory("GlucoseDialog").setAction("Add").build());
}