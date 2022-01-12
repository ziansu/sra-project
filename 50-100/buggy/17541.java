private int findTrainOnTrack(int trainID) {
    for (int i = 0; i < (trainsOnTrack.size()); ++i) {
        java.lang.System.out.println(("train =" + (trainsOnTrack.get(i).trainID)));
        if ((trainsOnTrack.get(i).trainID) == trainID)
            return i;
        
    }
    return -1;
}