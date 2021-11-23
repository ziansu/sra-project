private void handlePushPostCompleted(org.wordpress.android.fluxc.store.PostStore.RemotePostPayload payload) {
    if (payload.isError()) {
        org.wordpress.android.fluxc.store.PostStore.OnPostUploaded onPostUploaded = new org.wordpress.android.fluxc.store.PostStore.OnPostUploaded(payload.post);
        onPostUploaded.error = payload.error;
        emitChange(onPostUploaded);
    }else {
        if (payload.site.isWPCom()) {
            updatePost(payload.post, false);
            emitChange(new org.wordpress.android.fluxc.store.PostStore.OnPostUploaded(payload.post));
        }else {
            org.wordpress.android.fluxc.persistence.PostSqlUtils.insertOrUpdatePostOverwritingLocalChanges(payload.post);
            mPostXMLRPCClient.fetchPost(payload.post, payload.site, PostAction.PUSH_POST);
        }
    }
}