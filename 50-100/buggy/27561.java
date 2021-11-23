@java.lang.Override
public void onFailure(com.qwasi.sdk.QwasiError e) {
    if ((e.getCause()) instanceof java.io.FileNotFoundException) {
        qwasiInterface.onFailure(new com.qwasi.sdk.QwasiError().errorWithCode(QwasiErrorCode.QwasiErrorMessageNotFound, "Message not found "));
    }else {
        qwasiInterface.onFailure(new com.qwasi.sdk.QwasiError().errorWithCode(QwasiErrorCode.QwasiErrorMessageFetchFailed, "Message Fetch Failed"));
    }
}