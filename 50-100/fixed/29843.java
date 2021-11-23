@java.lang.Override
protected java.util.ArrayList<com.trebuh.clarity.models.Photo> doInBackground(com.trebuh.clarity.fragments.PhotoGridFragment.FetchPhotosTaskParams... params) {
    java.lang.String photosJsonResponse;
    photosJsonResponse = com.trebuh.clarity.PhotoFetcher.fetchPhotosJSON(params[0].page, params[0].feature, params[0].sortBy);
    return com.trebuh.clarity.PhotoFetcher.parsePhotoItems(photosJsonResponse);
}