@java.lang.Override
public void startPlay(boolean isHandFree) {
    mCurPlayVoicePosition = position;
    mViewImpl.refershAdapterStatus();
}