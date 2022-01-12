protected void setPicture() {
    mPictureViewContainer.setVisibility(View.VISIBLE);
    com.squareup.picasso.Picasso.with(this).load(mPictureUri).fit().into(((android.widget.ImageView) (mPictureViewContainer.findViewById(R.id.picture))));
    mAttachPictureButton.setVisibility(View.GONE);
}