@java.lang.Override
public void execute() throws com.couchbase.lite.support.action.ActionException {
    com.couchbase.lite.util.Log.i(Log.TAG_DATABASE, ((("BlobStore: " + (newKey != null ? "encrypting" : "decrypting")) + " ") + (path)));
    com.couchbase.lite.util.Log.i(Log.TAG_DATABASE, "BlobStore: **No blobs to copy; done.**");
    encryptionKey = newKey;
    try {
        markEncrypted((newKey != null));
    } catch (com.couchbase.lite.CouchbaseLiteException e) {
        throw new com.couchbase.lite.support.action.ActionException(e);
    }
}