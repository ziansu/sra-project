public void onResult(boolean success, com.geel9.facepunch.APISession.Category[] categories) {
    forumList.removeView(loaderImage);
    forumList.setGravity(Gravity.NO_GRAVITY);
    if (success && (categories != null)) {
        populateList(categories);
    }else {
        android.widget.Toast.makeText(this, getString(R.string.frontpageLoadingFailed), Toast.LENGTH_SHORT).show();
    }
}