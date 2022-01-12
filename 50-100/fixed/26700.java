@java.lang.Override
public void onBillingSupported(boolean supported, java.lang.String type) {
    if ((type == null) || (type.equals(Consts.ITEM_TYPE_INAPP))) {
        if (supported) {
            if (SoomlaConsts.DEBUG) {
                android.util.Log.d(com.soomla.store.SoomlaPurchaseObserver.TAG, "billing is supported !");
            }
        }else {
            if (SoomlaConsts.DEBUG) {
                android.util.Log.d(com.soomla.store.SoomlaPurchaseObserver.TAG, "billing is not supported !");
            }
            mActivity.sendSoomlaJS("disableCurrencyStore", "");
        }
    }else
        if (type.equals(Consts.ITEM_TYPE_SUBSCRIPTION)) {
        }else {
        }
    
}