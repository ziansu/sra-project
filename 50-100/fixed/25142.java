public void setModelLevel() {
    switch (ltsv.getSelectedLevelType()) {
        case "Puzzle" :
            levelIDs.add((++(highestLevelID)));
            bv.prepPuzzle();
            break;
        case "Lightning" :
            levelIDs.add((++(highestLevelID)));
            bv.prepLightning();
            break;
        case "Release" :
            levelIDs.add((++(highestLevelID)));
            bv.prepRelease();
            break;
    }
}