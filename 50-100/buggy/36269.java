public void saveImage(android.view.View view) {
    de.uni_koeln.phil_fak.spinfo.javamobile.picman.activity.util.ImageHelper imageHelper = de.uni_koeln.phil_fak.spinfo.javamobile.picman.activity.util.ImageHelper.getInstance();
    imageHelper.saveImageData(getApplicationContext(), thumbnail, getText(), de.uni_koeln.phil_fak.spinfo.javamobile.picman.activity.util.TimeStamper.getInstance().generateTimestamp(true), uri);
    android.content.Intent intent = new android.content.Intent(this, de.uni_koeln.phil_fak.spinfo.javamobile.picman.activity.PicManActivity.class);
    startActivity(intent);
    finish();
}