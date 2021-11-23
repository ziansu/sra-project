public void bindHolder(com.innofang.gankiodemo.bean.Luck.ResultsBean results) {
    java.lang.String date = com.innofang.gankiodemo.utils.StringFormatUtil.formatPublishAt(results.getPublishedAt());
    java.lang.String url = (results.getUrl()) + (com.innofang.gankiodemo.constant.URL.REQUEST_IMAGE_POSTFIX);
    android.util.Log.i(com.innofang.gankiodemo.module.main.dailygank.DailyGankAdapter.TAG, ("bindHolder: image url " + url));
    mDateTextView.setText(date);
    com.bumptech.glide.Glide.with(mContext).load(url).skipMemoryCache(false).diskCacheStrategy(DiskCacheStrategy.SOURCE).crossFade().into(mMeizhiImageView);
}