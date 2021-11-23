public void addAttachment(@android.support.annotation.NonNull
ly.loud.loudly.new_base.interfaces.attachments.Attachment attachment) {
    attachmentList.add(attachment);
    setEditTextParams();
    setAttachmentsParams();
    adapter.notifyDataSetChanged();
    if ((onAttachmentListener) != null) {
        onAttachmentListener.onAttachmentAdded(attachment);
    }
}