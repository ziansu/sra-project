@java.lang.Override
public void onFirstItemDroppedInDropZone(com.epicodus.shakeitup.models.Business item) {
    com.epicodus.shakeitup.ui.RestaurantChooserFragment restaurantChooserFragment = com.epicodus.shakeitup.ui.RestaurantChooserFragment.newInstance();
    mRestaurantsArray = com.epicodus.shakeitup.models.Business.getRandomDinner();
    android.os.Bundle args = new android.os.Bundle();
    args.putParcelable("drink", org.parceler.Parcels.wrap(item));
    args.putParcelable("restaurantsArray", org.parceler.Parcels.wrap(mRestaurantsArray));
    restaurantChooserFragment.setArguments(args);
    com.epicodus.shakeitup.ChooserActivity.loadingDialog.show();
    getPlaces(item, YelpService.DINNER, restaurantChooserFragment);
}