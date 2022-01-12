private void setUserInfoInMenu() {
    userFull_name.setText((((session.getName()) + " ") + (session.getPrename())));
    user_group.setText(("Group : " + (session.getGroup())));
    java.lang.String imageUrl = session.getPhotourl();
    com.mk.utils.DownloadImg down = new com.mk.utils.DownloadImg();
    down.getImage(profilepic, imageUrl);
}