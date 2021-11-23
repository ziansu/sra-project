private void randomizeNextTrack() {
    if ((mCurrentList.size()) > 0) {
        mNextPlayingIndex = mRandomGenerator.nextInt(mCurrentList.size());
        int counter = 0;
        while (((mNextPlayingIndex) == (mCurrentPlayingIndex)) && (counter < 20)) {
            mCurrentPlayingIndex = mRandomGenerator.nextInt(mCurrentList.size());
            counter++;
        } 
    }
}