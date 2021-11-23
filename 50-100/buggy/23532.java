public int getNextAssetAttachmentDisplayOrder() {
    int i = 1;
    for (dk.i2m.converge.core.content.NewsItemMediaAttachment attachment : getMediaAttachments()) {
        if (attachment != null) {
            if ((attachment.getDisplayOrder()) >= i) {
                i = (attachment.getDisplayOrder()) + 1;
            }
        }
    }
    return i;
}