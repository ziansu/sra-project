private void addAttachments(java.lang.String path) {
    if (!(mAttachmentsList.contains(new com.xhunter74.mailcomposer.models.AttachmentModel(path)))) {
        mAttachmentsList.add(new com.xhunter74.mailcomposer.models.AttachmentModel(path));
        mBinding.activityComposerAttachments.setText(java.lang.String.format(getString(R.string.activity_composer_attachments), mAttachmentsList.size()));
    }else {
        android.widget.Toast.makeText(this, getString(R.string.composer_activity_existed_attachment_warning), Toast.LENGTH_LONG).show();
    }
}