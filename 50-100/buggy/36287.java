private void doView() {
    if ((!(mReactable.isViewed())) && (!(mReactable.getDirector().equals(com.truethat.android.application.AppContainer.getAuthManager().getCurrentUser())))) {
        mReactable.doView();
        mInteractionApi.postEvent(new com.truethat.android.model.InteractionEvent(com.truethat.android.application.AppContainer.getAuthManager().getCurrentUser().getId(), mReactable.getId(), new java.util.Date(), com.truethat.android.model.EventType.REACTABLE_VIEW, null)).enqueue(mPostEventCallback);
    }
}