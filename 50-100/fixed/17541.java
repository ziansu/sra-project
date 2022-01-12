private int findTrainOnTrack(int trainID) {
    for (int i = 0; i < (trainsOnTrack.size()); ++i) {
        if ((trainsOnTrack.get(i).trainID) == trainID)
            return i;
        
    }
    return -1;
}