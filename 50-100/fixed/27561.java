@java.lang.Override
public void onFailure(com.qwasi.sdk.QwasiError e) {
    com.qwasi.sdk.QwasiError error;
    if ((e.getCause()) instanceof java.io.FileNotFoundException) {
        error = new com.qwasi.sdk.QwasiError().errorWithCode(QwasiErrorCode.QwasiErrorMessageNotFound, "Message not found ");
    }else {
        error = new com.qwasi.sdk.QwasiError().errorWithCode(QwasiErrorCode.QwasiErrorMessageFetchFailed, "Message Fetch Failed");
    }
    qwasiInterface.onFailure(error);
}