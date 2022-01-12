public static com.pommerening.quinn.foodtruck.fragment.dialogs.AddFavoriteDialog newInstance(java.lang.String username, java.lang.String productID, java.lang.String productPrice, java.lang.String productName, java.lang.String truckName) {
    com.pommerening.quinn.foodtruck.fragment.dialogs.AddFavoriteDialog fragment = new com.pommerening.quinn.foodtruck.fragment.dialogs.AddFavoriteDialog();
    android.os.Bundle args = new android.os.Bundle();
    args.putString("username", username);
    args.putString("productID", productID);
    args.putString("productPrice", productPrice);
    args.putString("productName", productName);
    args.putString("truckName", truckName);
    fragment.setArguments(args);
    return fragment;
}