@java.lang.Override
public void onClick(android.view.View view) {
    android.content.Intent fullscreenImageView = new android.content.Intent(context, in.co.mdg.campusBuddy.fb.FullscreenImageView.class);
    fullscreenImageView.putExtra("img_src", post.getImageUrl());
    fullscreenImageView.putExtra("title", post.getHeader());
    fullscreenImageView.putExtra("message", post.getMessage());
    fullscreenImageView.putExtra("time", in.co.mdg.campusBuddy.fb.DateFormatter.getTimeAgo(post.getDateS()));
    getContext().startActivity(fullscreenImageView);
}