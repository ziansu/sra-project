@java.lang.Override
protected void onPostExecute(java.lang.Boolean aBoolean) {
    if (aBoolean) {
        com.home77.kake.App.eventBus().post(new com.home77.kake.common.event.BroadCastEvent(com.home77.kake.common.event.BroadCastEventConstant.CAMERA_LINKED, null));
        if ((pagerMainTab.getCurrentItem()) == 1) {
            titleTextView.setText(R.string.local_photo);
            pagerMainTab.setCurrentItem(0, false);
            android.content.Intent intent = new android.content.Intent(this, com.home77.kake.business.camera.CameraActivity.class);
            startActivity(intent);
        }
    }else {
        com.home77.kake.App.eventBus().post(new com.home77.kake.common.event.BroadCastEvent(com.home77.kake.common.event.BroadCastEventConstant.CAMERA_UNLINKED, null));
    }
}