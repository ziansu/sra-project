@java.lang.Override
public void onFirstItemDroppedInDropZone(com.epicodus.shakeitup.models.Business item) {
    com.epicodus.shakeitup.ui.RestaurantChooserFragment restaurantChooserFragment = com.epicodus.shakeitup.ui.RestaurantChooserFragment.newInstance();
    android.os.Bundle args = new android.os.Bundle();
    args.putParcelable("drink", org.parceler.Parcels.wrap(item));
    restaurantChooserFragment.setArguments(args);
    com.epicodus.shakeitup.ChooserActivity.loadingDialog.show();
    getPlaces(item, YelpService.DINNER, restaurantChooserFragment);
}