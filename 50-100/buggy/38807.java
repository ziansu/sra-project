@java.lang.Override
public void onClick(android.content.DialogInterface dialog, int item) {
    if (items[item].equals("Chụp ảnh mới")) {
        cameraIntent();
    }else
        if (items[item].equals("Chọn ảnh")) {
            circleImageView.setImageResource(R.drawable.download);
            com.soundcloud.android.crop.Crop.pickImage(this);
        }
    
}