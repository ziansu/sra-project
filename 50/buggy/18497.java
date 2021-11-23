@java.lang.Override
public void onSuccess(java.lang.Object result) {
    inventory.load().whenLoaded(this);
    if ((listener()) != null)
        listener().onConsumeSuccess(prodId);
    
}