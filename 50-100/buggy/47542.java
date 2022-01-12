public com.layer.atlas.AtlasMessageComposer setConversation(com.layer.sdk.messaging.Conversation conversation) {
    mConversation = conversation;
    if ((mTextSender) != null)
        mTextSender.setData(conversation, mAuthenticatedUser.getName());
    
    for (com.layer.atlas.messagetypes.AttachmentSender sender : mAttachmentSenders) {
        sender.setData(conversation, mAuthenticatedUser.getName());
    }
    return this;
}