protected void handleInput() {
    if ((((mState) == (com.tanosys.videolibrary.MediaDecoder.STATE_PLAYING)) && (!(mInputDone))) || ((mState) == (com.tanosys.videolibrary.MediaDecoder.STATE_SEEKING))) {
        final int inputBufIndex = mMediaCodec.dequeueInputBuffer(com.tanosys.videolibrary.MediaDecoder.TIMEOUT_USEC);
        if (inputBufIndex == (android.media.MediaCodec.INFO_TRY_AGAIN_LATER))
            return ;
        
        mInputDone = input(inputBufIndex);
        android.util.Log.d(com.tanosys.videolibrary.MediaDecoder.TAG, (((TRACK_TYPE) + "input done ") + (mInputDone)));
    }
}