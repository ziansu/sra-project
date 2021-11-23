@java.lang.Override
public void onCreateEventInteraction(tcss450.uw.edu.project18.event.Event createdEvent, java.lang.String createURL) {
    android.util.Log.i("CREATE", "Create task started");
    mCreatedEvent = createdEvent;
    mProgressDialog.setTitle("Creating Event");
    mProgressDialog.show();
    tcss450.uw.edu.project18.CreateEventTask cet = new tcss450.uw.edu.project18.CreateEventTask(this);
    cet.execute(createURL);
}