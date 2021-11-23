@java.lang.Override
public void onResponse(retrofit2.Call<com.dreamfactory.sampleapp.models.FileRecord> call, retrofit2.Response<com.dreamfactory.sampleapp.models.FileRecord> response) {
    if (response.isSuccessful()) {
        com.dreamfactory.sampleapp.models.FileRecord fileRecord = response.body();
        com.dreamfactory.sampleapp.activities.ContactViewActivity.ConvertToBitmap convertToBitmapTask = new com.dreamfactory.sampleapp.activities.ContactViewActivity.ConvertToBitmap();
        convertToBitmapTask.execute(fileRecord.getContent());
    }else {
        com.dreamfactory.sampleapp.models.ErrorMessage e = com.dreamfactory.sampleapp.api.DreamFactoryAPI.getErrorMessage(response);
        onFailure(call, e.toException());
    }
}