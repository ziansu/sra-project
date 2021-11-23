@java.lang.Override
public void onSuccess(org.matrix.androidsdk.crypto.data.MXEncryptEventContentResult encryptEventContentResult) {
    event.type = encryptEventContentResult.mEventType;
    event.updateContent(encryptEventContentResult.mEventContent.getAsJsonObject());
    event.setClearEvent(mDataHandler.getCrypto().decryptEvent(event, null));
    mDataHandler.onEventEncrypted(event);
    event.mSentState = Event.SentState.SENDING;
    mDataHandler.getDataRetriever().getRoomsRestClient().sendEventToRoom(getRoomId(), encryptEventContentResult.mEventType, encryptEventContentResult.mEventContent.getAsJsonObject(), localCB);
}