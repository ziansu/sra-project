public co.vendoo.vendooepicodus.ui.StoreDetailFragment newInstance(co.vendoo.vendooepicodus.models.Store store) {
    co.vendoo.vendooepicodus.ui.StoreDetailFragment storeDetailFragment = new co.vendoo.vendooepicodus.ui.StoreDetailFragment();
    android.os.Bundle args = new android.os.Bundle();
    args.putParcelable("store", org.parceler.Parcels.wrap(store));
    storeDetailFragment.setArguments(args);
    return storeDetailFragment;
}