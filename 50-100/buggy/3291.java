@java.lang.Override
public void onResponse(org.json.JSONObject response) {
    com.android.volley.toolbox.ImageLoader loader = com.alan.rockonapp.controller.AppController.getInstance(getContext()).getImageLoader();
    mConcertFavorite.setIsIndicator(true);
    mConcertFavorite.setNumStars(1);
    try {
        if (response.getBoolean(com.alan.rockonapp.fragment.FAVORITE))
            mConcertFavorite.setRating(1);
        
        mConcertPicture.setImageUrl(response.getString(com.alan.rockonapp.fragment.MEDIUM_IMAGE_URL), loader);
    } catch (org.json.JSONException ex) {
        ex.printStackTrace();
    }
}