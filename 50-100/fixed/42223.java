public void setState(int state, int[] owners) {
    curState = state;
    if (owners != null) {
        ownerIndices = new int[owners.length];
        for (int i = 0; i < (ownerIndices.length); ++i) {
            ownerIndices[i] = owners[i];
        }
    }else {
        ownerIndices = null;
    }
    setImage();
}