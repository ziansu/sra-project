public com.layer.atlas.AtlasMessageComposer setTextSender(com.layer.atlas.messagetypes.text.TextSender textSender) {
    mTextSender = textSender;
    mTextSender.init(this.getContext().getApplicationContext(), mLayerClient);
    mTextSender.setData(mConversation, mAuthenticatedUser.getName());
    if ((mMessageSenderCallback) != null)
        mTextSender.setCallback(mMessageSenderCallback);
    
    return this;
}