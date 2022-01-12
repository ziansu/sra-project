@java.lang.SuppressWarnings(value = "unused")
public void onEvent(de.fau.cs.mad.fablab.android.view.fragments.productsearch.ProductClickedEvent event) {
    de.fau.cs.mad.fablab.android.view.fragments.productsearch.ProductDialogFragment dialogFragment = new de.fau.cs.mad.fablab.android.view.fragments.productsearch.ProductDialogFragment();
    android.os.Bundle arguments = new android.os.Bundle();
    arguments.putSerializable(ProductDialogFragmentViewModel.KEY_PRODUCT, event.getProduct());
    dialogFragment.setArguments(arguments);
    dialogFragment.show(getFragmentManager(), "ProductDialogFragment");
}