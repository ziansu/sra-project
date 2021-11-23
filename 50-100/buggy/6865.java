private void handleAutoImprov(int slotInPlayback) {
    int gap = lickgenFrame.getGap();
    if ((lickgenFrame.getRecurrent()) && (slotInPlayback >= ((stopPlaybackAtSlot) - gap))) {
        (recurrentIteration)++;
        setFirstChorus(false);
        setStatus(("Chorus " + (recurrentIteration)));
        int start = improviseStartSlot;
        originalGenerate(lickgen, start, improviseEndSlot);
    }
}