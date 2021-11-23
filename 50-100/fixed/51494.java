@java.lang.Override
public void onChildAdded(com.firebase.client.DataSnapshot dataSnapshot, java.lang.String s) {
    try {
        org.dreamitcodeit.storyteller.Story story = dataSnapshot.getValue(org.dreamitcodeit.storyteller.Story.class);
        dropMarker(story, dataSnapshot.getKey());
        closeToStory(mCurrentLocation);
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}