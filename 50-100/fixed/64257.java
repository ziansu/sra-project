@java.lang.Override
public void onClick(android.view.View v) {
    switch (v.getId()) {
        case R.id.btnLaunch :
            android.content.Intent intent = new android.content.Intent(this, com.group2.swinghelper.CameraActivity.class);
            startActivity(intent);
            break;
        case R.id.btnList :
            android.content.Intent intent2 = new android.content.Intent(this, com.group2.swinghelper.GalleryActivity.class);
            startActivity(intent2);
            break;
    }
}