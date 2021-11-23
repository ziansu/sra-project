@java.lang.Override
public void onResponse(retrofit2.Call<com.beautiful_wallpapers_hd_qhd.core.retrofit.enteties.PhotoSizes> call, retrofit2.Response<com.beautiful_wallpapers_hd_qhd.core.retrofit.enteties.PhotoSizes> response) {
    java.lang.String previewUrl = response.body().getSizes().getSizesArray().get(FlickrHelper.SIZE_LARGE).getSize();
    setPreviewImageUrl(previewUrl);
    loadPreviewImage(previewUrl);
}