@java.lang.Override
public void onSuccess(java.lang.Object result) {
    if ((listener()) != null)
        listener().onConsumeSuccess(prodId);
    
}