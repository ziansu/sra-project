@java.lang.Override
protected void onDestroy() {
    super.onDestroy();
    unregisterReceiver(mReceiver);
    org.videolan.libvlc.EventHandler em = org.videolan.libvlc.EventHandler.getInstance();
    em.removeHandler(eventHandler);
    mLibVLC.eventVideoPlayerActivityCreated(false);
    if (mDisabledHardwareAcceleration)
        mLibVLC.setHardwareAcceleration(mPreviousHardwareAccelerationMode);
    
    mAudioManager = null;
    mRoom.departChatRoom(connection, invitedRoom);
}