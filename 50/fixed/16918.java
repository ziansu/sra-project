@java.lang.Override
public void showUserImage(java.lang.String imageUrl) {
    userImage.setVisibility(View.VISIBLE);
    com.bumptech.glide.Glide.with(this).load(imageUrl).error(R.drawable.profile_picture_placeholder).placeholder(R.drawable.profile_picture_placeholder).into(userImage);
}