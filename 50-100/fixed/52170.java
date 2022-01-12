public static com.pommerening.quinn.foodtruck.fragment.dialogs.EditFavoritesDialogFragment newInstance(java.lang.String username, java.lang.String productID, java.lang.String productName, java.lang.String productPrice, java.lang.String truckName) {
    com.pommerening.quinn.foodtruck.fragment.dialogs.EditFavoritesDialogFragment f = new com.pommerening.quinn.foodtruck.fragment.dialogs.EditFavoritesDialogFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putString("username", username);
    args.putString("productName", productName);
    args.putString("productPrice", productPrice);
    args.putString("productID", productID);
    args.putString("truckName", truckName);
    f.setArguments(args);
    return f;
}