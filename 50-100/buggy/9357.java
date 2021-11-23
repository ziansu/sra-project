private void configureViewHolderSimpleStory(com.codepath.timeline.adapters.StoriesAdapter.ViewHolderSimpleStory holder, int position) {
    com.codepath.timeline.models.Story story = mStories.get(position);
    android.util.Log.d("DEBUG", story.toString());
    if (story != null) {
        com.bumptech.glide.Glide.with(context).load(story.getBackgroundImageUrl()).fitCenter().bitmapTransform(new jp.wasabeef.glide.transformations.RoundedCornersTransformation(context, 25, 0)).into(holder.getIvBackgroundImage());
        holder.getTvStoryTitle().setText(story.getStoryTitle());
    }
}