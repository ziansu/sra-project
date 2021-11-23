public static com.tallty.smart_life_android.fragment.cart.SelectAddress newInstance(java.util.ArrayList<com.tallty.smart_life_android.model.Contact> contacts) {
    android.os.Bundle args = new android.os.Bundle();
    args.putSerializable(Const.OBJECT_List, contacts);
    com.tallty.smart_life_android.fragment.cart.SelectAddress fragment = new com.tallty.smart_life_android.fragment.cart.SelectAddress();
    fragment.setArguments(args);
    return fragment;
}