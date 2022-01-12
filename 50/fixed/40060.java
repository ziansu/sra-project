@java.lang.Override
protected void onPostExecute(com.liujuan.destination.dto.PhotosAndIntroOfCityResponse response) {
    if (response != null) {
        mCurrentCity.setImages(response.getPhotos());
        mCurrentCity.setUrl(response.getIntroductionUrl());
        updateGalleryAdapter(response.getPhotos());
    }
}