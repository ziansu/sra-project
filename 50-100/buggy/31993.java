private void initPortrait() {
    headPortrait = ((com.summer.view.CircularImage) (rootView.findViewById(R.id.portrait)));
    com.bumptech.glide.Glide.with(container.activity).load(com.BC.entertainment.cache.InfoCache.getInstance().getStartInfo().getHead_portrait()).centerCrop().diskCacheStrategy(DiskCacheStrategy.ALL).placeholder(R.drawable.avatar_def).into(headPortrait);
    com.summer.logger.XLog.i(("custom portrait: " + (com.BC.entertainment.cache.InfoCache.getInstance().getPersonalInfo().getHead_portrait())));
}