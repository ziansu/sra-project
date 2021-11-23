@java.lang.Override
public void onResponse(retrofit2.Call<com.divyanshu.pixabayserverapi.callback.PixabayDataObject> call, retrofit2.Response<com.divyanshu.pixabayserverapi.callback.PixabayDataObject> response) {
    if (((response.body()) == null) && ((response.body().hits.size()) == 0)) {
        mainActivityView.showErrorMessage(R.string.no_image_error);
        return ;
    }
    mainActivityView.onImageListResponse(response.body().hits);
}