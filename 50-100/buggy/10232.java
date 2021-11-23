@java.lang.Override
public void onRestoreInstanceState(android.os.Bundle savedInstanceState) {
    if (savedInstanceState.containsKey(sk.momosi.fuelapp.activities.UpdateCarActivity.PHOTO)) {
        mCurrentPhotoLarge = savedInstanceState.getParcelable(sk.momosi.fuelapp.activities.UpdateCarActivity.PHOTO);
        android.widget.ImageView im = ((android.widget.ImageView) (findViewById(R.id.img_addcar_car)));
        im.setImageBitmap(mCurrentPhotoLarge);
    }
}