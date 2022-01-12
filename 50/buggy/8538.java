public void onClickSetPathUp(android.view.View view) {
    mProfileService.getMapClient(mMasInstanceId).setFolderUp();
    goToState(org.codeaurora.bluetooth.bttestapp.MapTestActivity.Job.SET_PATH);
}