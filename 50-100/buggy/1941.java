@java.lang.Override
public void onResponse(java.lang.Object response) {
    if ((method.equals(XMLRPC.NEW_POST)) && (response instanceof java.lang.String)) {
        post.setRemotePostId(java.lang.Integer.valueOf(((java.lang.String) (response))));
    }
    post.setIsLocalDraft(false);
    post.setIsLocallyChanged(false);
    org.wordpress.android.fluxc.store.PostStore.RemotePostPayload payload = new org.wordpress.android.fluxc.store.PostStore.RemotePostPayload(post, site);
    mDispatcher.dispatch(org.wordpress.android.fluxc.generated.PostActionBuilder.newPushedPostAction(payload));
}