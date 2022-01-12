private void resetBlocks() {
    for (int changeToOrig = 0; changeToOrig < (plateXZsTotal); changeToOrig += 2) {
        origBlocks.get(changeToOrig).setType(origMats.get(changeToOrig));
        origBlocks.get((changeToOrig + 1)).setType(origMats.get((changeToOrig + 1)));
    }
}