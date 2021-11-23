public void populate(com.ddmeng.zhihudaily.data.models.db.Story story, com.ddmeng.zhihudaily.imageloader.ImageLoader imageLoader) {
    imageLoader.load(story.getListImage(), topImageView);
    topTitleView.setText(story.getTitle());
}