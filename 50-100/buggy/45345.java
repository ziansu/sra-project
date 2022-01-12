@java.lang.Override
public boolean onException(java.lang.Exception e, java.lang.String model, com.bumptech.glide.request.target.Target<com.bumptech.glide.load.resource.drawable.GlideDrawable> target, boolean isFirstResource) {
    if (((e.getMessage()) != null) && (e.getMessage().contains("Request failed"))) {
        android.util.Log.d(com.clem.nhkradio.adapter.AuthorRecyclerAdapter.TAG, (("onException: " + itemId) + (e.getMessage())));
        article.setRealImageAddress(com.clem.nhkradio.constant.Constant.EXCEPTION);
    }
    return false;
}