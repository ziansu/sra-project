private void onClickDisconnect() {
    if (((mProfileService) != null) && ((mProfileService.getMapClient(mMasInstanceId)) != null)) {
        mProfileService.getMapClient(mMasInstanceId).disconnect();
        goToState(org.codeaurora.bluetooth.bttestapp.MapTestActivity.Job.DISCONNECT);
    }
}