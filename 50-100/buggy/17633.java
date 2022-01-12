@java.lang.Override
public void onComplete(com.google.firebase.database.DatabaseError databaseError, com.google.firebase.database.DatabaseReference databaseReference) {
    if (databaseError != null) {
        android.util.Log.w(com.google.codeu.chatme.presenter.CreateGroupPresenter.TAG, ("addGroupConversation:failure " + (databaseError.getMessage())));
    }else {
        android.util.Log.i(com.google.codeu.chatme.presenter.CreateGroupPresenter.TAG, ("addGroupConversation:success " + conversationId));
        if (picData != null) {
            uploadGroupPictureToStorage(picData, conversationId);
        }else {
            view.openMessageActivity();
        }
    }
}