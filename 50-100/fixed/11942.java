public void removeConnectedFlagCascade(int trackIdx) {
    mTracks.get(trackIdx).setConnectedPrev(false);
    for (int i = trackIdx + 1; i < (mTracks.size()); i++) {
        if (mTracks.get(i).isConnectedPrev())
            mTracks.get(i).setConnectedPrev(false);
        else
            break;
        
    }
}