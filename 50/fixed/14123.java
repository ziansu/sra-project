@java.lang.Override
public void onSaveInstanceState(android.os.Bundle outState) {
    super.onSaveInstanceState(outState);
    if ((mCurrentPhotoLarge) != null) {
        outState.putParcelable(sk.momosi.fuelapp.activities.UpdateCarActivity.PHOTO, mCurrentPhotoLarge);
    }
}