private void InitUI() {
    butterknife.ButterKnife.bind(this);
    swipeLayout.setOnRefreshListener(this);
    imageLoader = new name.parker.alon.viewerforgithub.model.image.PicassoImageLoader(com.squareup.picasso.Picasso.with(this));
    avatar.setImageResource(R.drawable.octocat);
}