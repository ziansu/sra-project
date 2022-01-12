protected void setAvatar(java.lang.String path) {
    avatarImagePath = person.getIdPhoto();
    if ((avatarImagePath) != "") {
        avatarView.setImageURI(android.net.Uri.parse(avatarImagePath));
        avatarView.setScaleType(ImageView.ScaleType.CENTER_CROP);
    }
}