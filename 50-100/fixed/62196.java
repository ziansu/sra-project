private int updateState(int state) {
    if ((state & (((chongxuocmanhinh.sound_plusplus.PlaybackService.FLAG_NO_MEDIA) | (chongxuocmanhinh.sound_plusplus.PlaybackService.FLAG_ERROR)) | (chongxuocmanhinh.sound_plusplus.PlaybackService.FLAG_EMPTY_QUEUE))) != 0)
        state &= ~(chongxuocmanhinh.sound_plusplus.PlaybackService.FLAG_PLAYING);
    
    int oldState = mState;
    mState = state;
    if (state != oldState) {
        mHandler.sendMessage(mHandler.obtainMessage(chongxuocmanhinh.sound_plusplus.PlaybackService.MSG_PROCESS_STATE, oldState, state));
        mHandler.sendMessage(mHandler.obtainMessage(chongxuocmanhinh.sound_plusplus.PlaybackService.MSG_BROADCAST_CHANGE, state, 0, new chongxuocmanhinh.sound_plusplus.TimestampedObject(null)));
    }
    return state;
}