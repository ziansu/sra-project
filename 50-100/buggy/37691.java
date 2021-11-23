public static void startMailPhotoViewActivity(final android.content.Context context, final java.lang.String account, final java.lang.String accountType, final com.android.mail.browse.ConversationMessage msg, final int photoIndex) {
    final com.android.ex.photo.Intents.PhotoViewIntentBuilder builder = com.android.ex.photo.Intents.newPhotoViewIntentBuilder(context, context.getString(R.string.photo_view_activity));
    builder.setPhotosUri(msg.attachmentListUri.toString()).setProjection(UIProvider.ATTACHMENT_PROJECTION).setPhotoIndex(photoIndex);
    context.startActivity(com.android.mail.photo.MailPhotoViewActivity.wrapIntent(builder.build(), account, accountType, msg));
}