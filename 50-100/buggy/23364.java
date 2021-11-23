@java.lang.Override
public void onCompletion(java.lang.Object result, java.lang.Throwable e) {
    if ((error) != null) {
        android.util.Log.v(TDDatabase.TAG, java.lang.String.format("%s: Unable to save remote checkpoint: %s", this, e), e);
    }else {
        java.util.Map<java.lang.String, java.lang.Object> response = ((java.util.Map<java.lang.String, java.lang.Object>) (result));
        body.put("_rev", response.get("rev"));
        remoteCheckpoint = body;
    }
}