@java.lang.Override
public void onResponse(okhttp3.Call call, okhttp3.Response response) throws java.io.IOException {
    if ((chooserFragment instanceof com.epicodus.shakeitup.ui.RestaurantChooserFragment) || (chooserFragment instanceof com.epicodus.shakeitup.ui.FunChooserFragment)) {
        yelpService.processResults(response, category);
        getSupportFragmentManager().beginTransaction().replace(R.id.chooser_content_layout, chooserFragment).commit();
    }else {
        android.util.Log.e(com.epicodus.shakeitup.ChooserActivity.TAG, "Called fragment not instance of RestaurantChooserFragment or FunChooserFragment");
    }
    com.epicodus.shakeitup.ChooserActivity.loadingDialog.hide();
}