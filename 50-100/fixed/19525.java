private void roomImage() {
    com.facebook.drawee.view.SimpleDraweeView myImage = ((com.facebook.drawee.view.SimpleDraweeView) (findViewById(R.id.room_image)));
    java.lang.String current_room_pic = sp.getString("current_room_pic", null);
    if (current_room_pic != null) {
        android.net.Uri uri = android.net.Uri.parse(current_room_pic);
        myImage.setImageURI(uri);
    }
}