public void setItem(@android.support.annotation.NonNull
com.layer.sdk.messaging.Conversation conversation, @android.support.annotation.NonNull
com.layer.sdk.messaging.Identity authenticatedUser) {
    setItem(conversation);
    mParticipantsMinusAuthenticatedUser.clear();
    mParticipantsMinusAuthenticatedUser.addAll(conversation.getParticipants());
    mParticipantsMinusAuthenticatedUser.remove(authenticatedUser);
    mAuthenticatedUser = authenticatedUser;
}