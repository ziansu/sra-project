protected int getBestResponsesGroup() {
    int maxCoherentResponses = 0;
    int bestGroupSoFar = 0;
    for (int i = 0; i < (responseGroups.size()); ++i) {
        final int currentGroupSize = responseGroups.get(i).size();
        if (currentGroupSize > maxCoherentResponses) {
            maxCoherentResponses = currentGroupSize;
            bestGroupSoFar = i;
        }
    }
    return bestGroupSoFar;
}