private void loadChatThread() {
    com.google.firebase.database.Query messageQuery = messagesRef.orderByChild(ConversationKeys.TIME);
    messageQuery.addListenerForSingleValueEvent(new com.google.firebase.database.ValueEventListener() {
        @java.lang.Override
        public void onDataChange(com.google.firebase.database.DataSnapshot dataSnapshot) {
            if ((dataSnapshot.getValue()) == null) {
                findViewById(R.id.progress_chat_thread).setVisibility(View.GONE);
                listChatThread.setVisibility(View.VISIBLE);
            }
        }

        @java.lang.Override
        public void onCancelled(com.google.firebase.database.DatabaseError databaseError) {
        }
    });
    findViewById(R.id.progress_chat_thread).setVisibility(View.GONE);
    messageQuery.addChildEventListener(childEventListener);
}