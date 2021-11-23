public void removeConnectedFlagCascade(int trackIdx) {
    for (int i = trackIdx; i < (mTracks.size()); i++) {
        if (mTracks.get(i).isConnectedPrev())
            mTracks.get(i).setConnectedPrev(false);
        else
            break;
        
    }
}