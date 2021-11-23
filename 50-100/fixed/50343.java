@java.lang.Override
public void handle(com.baasbox.android.BaasResult<com.baasbox.android.json.JsonObject> result) {
    mLinkCreateRequest = null;
    if (result.isFailed()) {
        showFailureAlert();
    }else
        if (result.isSuccess()) {
            showSuccessAlert();
            android.util.Log.d(TAG, "IN HANDLER SUCCES");
        }
    
}