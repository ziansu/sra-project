public static void setAvatarImage(android.content.Context context, com.kayako.sdk.android.k5.common.view.CircleImageView avatarView, java.lang.String avatarUrl) {
    if (avatarUrl != null) {
        com.bumptech.glide.Glide.with(context).load(avatarUrl).placeholder(R.drawable.ko__bot_avatar).crossFade().centerCrop().skipMemoryCache(false).diskCacheStrategy(DiskCacheStrategy.SOURCE).into(avatarView);
    }else {
        com.bumptech.glide.Glide.with(context).load(R.drawable.ko__bot_avatar).into(avatarView);
    }
}