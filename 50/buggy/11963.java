@java.lang.Override
public void onSuccess(java.util.List<com.yellowpineapple.wakup.sdk.models.Offer> offers) {
    listener.onSuccess(offers.get(0));
}