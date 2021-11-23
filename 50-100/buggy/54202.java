public int getDirection() {
    int[] lBeatDirn = new int[]{ 0 , 0 , -1 , -1 , -1 , -1 , -1 , 1 , 1 , 1 , 1 , 1 , 0 , 0 , 0 , 0 };
    assert (mBeatsLeftInSection) <= 16;
    return lBeatDirn[(16 - (mBeatsLeftInSection))];
}