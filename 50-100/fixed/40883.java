@android.support.annotation.NonNull
private java.lang.String getErrorMessageFromMediaError(org.wordpress.android.fluxc.store.MediaStore.OnMediaUploaded event) {
    java.lang.String errorMessage = org.wordpress.android.util.WPMediaUtils.getErrorMessage(mContext, true, true, event.media, event.error);
    if (errorMessage == null) {
        errorMessage = (android.text.TextUtils.isEmpty(event.error.message)) ? event.error.type.toString() : event.error.message;
    }
    return errorMessage;
}