public int findNearestPoint(float mid) {
    int i;
    int return_index = 0;
    float diff;
    if (mid >= (selectivity[((OfflinePB.resolution) - 1)]))
        return (OfflinePB.resolution) - 1;
    
    for (i = 0; i < (OfflinePB.resolution); i++) {
        diff = mid - (selectivity[i]);
        if (diff <= 0) {
            return_index = i;
            break;
        }
    }
    return return_index;
}