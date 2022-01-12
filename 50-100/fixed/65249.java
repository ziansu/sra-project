@java.lang.Override
public void executeAsync() {
    java.lang.String params = fileObjectAccess.getParams();
    try {
        com.quickblox.content.QBContent.uploadFile(file1, params, new com.quickblox.core.QBProgressCallback() {
            @java.lang.Override
            public void onProgressUpdate(int progress) {
                android.util.Log.i(com.sdk.snippets.modules.SnippetsContent.TAG, ("progress: " + progress));
            }
        }).perform();
    } catch (com.quickblox.core.exception.QBResponseException e) {
        setException(e);
    }
}