@java.lang.Override
public void onError(int response, java.lang.Exception e) {
    if (response == (org.solovyev.android.checkout.ResponseCodes.ITEM_NOT_OWNED)) {
        inventory.load().whenLoaded(this);
    }else {
        if ((listener()) != null)
            listener().onConsumeFailed();
        
    }
}