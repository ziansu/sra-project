private void handleAutoImprov(int slotInPlayback) {
    int gap = lickgenFrame.getGap();
    if ((lickgenFrame.getRecurrent()) && (slotInPlayback >= ((stopPlaybackAtSlot) - gap))) {
        (recurrentIteration)++;
        setFirstChorus(false);
        setStatus(("Chorus " + (recurrentIteration)));
        originalGenerate(lickgen, improviseStartSlot, improviseEndSlot);
    }
}