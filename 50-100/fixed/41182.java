@java.lang.Override
protected void onPostExecute(java.lang.Boolean aBoolean) {
    if (aBoolean) {
        com.home77.kake.App.eventBus().post(new com.home77.kake.common.event.BroadCastEvent(com.home77.kake.common.event.BroadCastEventConstant.CAMERA_LINKED, null));
    }else {
        com.home77.kake.App.eventBus().post(new com.home77.kake.common.event.BroadCastEvent(com.home77.kake.common.event.BroadCastEventConstant.CAMERA_UNLINKED, null));
    }
}