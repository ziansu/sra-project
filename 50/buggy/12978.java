@java.lang.Override
public void onSuccess(java.io.InputStream inputStream, android.os.Bundle params) {
    byte[] content = params.getByteArray(com.quickblox.core.Consts.CONTENT_TAG);
    android.util.Log.i(com.sdk.snippets.modules.SnippetsCustomObjects.TAG, "file downloaded");
}