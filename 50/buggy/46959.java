public static com.example.miljanrakita.shoppingapplication.Fragments.DialogFragments.AddProductDialogFragment getStartIntent(java.lang.String parentId) {
    com.example.miljanrakita.shoppingapplication.Fragments.DialogFragments.AddProductDialogFragment intent = new com.example.miljanrakita.shoppingapplication.Fragments.DialogFragments.AddProductDialogFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putString(com.example.miljanrakita.shoppingapplication.Util.Constants.ADD_PRODUCT_PARENT_ID_KEY, parentId);
    intent.setArguments(args);
    return intent;
}