@java.lang.Override
protected void convert(com.chad.library.adapter.base.BaseViewHolder baseViewHolder, com.tianbin.theoldreaderapp.data.module.BlogList.Blog blog) {
    baseViewHolder.setText(R.id.tv_title, blog.getTitle()).setText(R.id.tv_origin_title, blog.getOrigin().getTitle()).setText(R.id.tv_post_time, com.tianbin.theoldreaderapp.common.util.CalendarUtil.getBlogPostTime(blog.getPublished())).addOnClickListener(R.id.ll_blog_holder_root).addOnClickListener(R.id.tv_origin_title);
}