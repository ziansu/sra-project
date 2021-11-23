@java.lang.Override
public void onFailure(retrofit2.Call<com.desk.java.apiclient.model.Case> call, java.lang.Throwable throwable) {
    callback.onCreateCaseError(new com.desk.android.sdk.error.ErrorResponse(throwable));
}