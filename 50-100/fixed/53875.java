private void startLoading() {
    if ((this.currentRequest) != null) {
        this.currentRequest.cancel();
    }
    this.currentRequest = com.vkclient.supports.RequestCreator.getHistory(this.COUNT, this.profileId);
    this.currentRequest.executeWithListener(this.getHistoryRequest);
}