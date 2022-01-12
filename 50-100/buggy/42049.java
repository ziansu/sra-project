@java.lang.Override
protected void convert(com.chad.library.adapter.base.BaseViewHolder helper, com.yc.english.weixin.model.domain.CourseInfo item) {
    helper.setText(R.id.tv_title, item.getTitle());
    long addTime = (java.lang.Long.parseLong(item.getAdd_time())) * 1000;
    helper.setText(R.id.tv_time, com.blankj.utilcode.util.TimeUtils.millis2String(addTime, new java.text.SimpleDateFormat(("yyyy-MM-dd " + "HH:mm:ss"), java.util.Locale.getDefault())));
    com.yc.english.base.helper.GlideHelper.imageView(mContext, ((android.widget.ImageView) (helper.getView(R.id.iv_icon))), item.getImg(), R.drawable.sample);
}