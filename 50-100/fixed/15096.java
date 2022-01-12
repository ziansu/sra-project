public void createFacts(ab.vision.ABType currentBird) {
    addBirdTypeToExecutor(currentBird);
    addTrajectoryInfoToExecutor(vision.findSlingshotRealShape());
    addPigs(vision.findPigsMBR());
    addBlocks(vision.findBlocksRealShape());
    addTNTs(vision.findTNTs());
}