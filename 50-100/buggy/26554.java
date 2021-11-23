@java.lang.Override
public void onSuccess(byte[] bytes) {
    android.graphics.Bitmap image = android.graphics.BitmapFactory.decodeByteArray(bytes, 0, bytes.length);
    if (i.hasExtra("profile")) {
        com.sjsu.se195.irom.Classes.Profile profile = i.getParcelableExtra("profile");
        initializeFromMarketplace(updatedListing, profile, image);
    }else {
        initializeFromItemDetail(updatedListing, image);
    }
}