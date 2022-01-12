@java.lang.Override
public void Update(java.lang.String response) {
    java.lang.System.out.println(response);
    handlepopulateInboxResponse(response);
    mAdapter = new com.example.mrides.Notification.InboxAdapter(this, invitations);
    mRecyclerView.setAdapter(mAdapter);
    if ((getIntent().getParcelableExtra("NOTIFICATION")) != null) {
        notification = ((com.google.firebase.messaging.RemoteMessage) (getIntent().getParcelableExtra("NOTIFICATION")));
        ((com.example.mrides.Notification.InboxAdapter) (mAdapter)).setViewComponents(notification.getData());
    }
}