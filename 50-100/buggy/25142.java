public void setModelLevel(int levelID) {
    switch (ltsv.getSelectedLevelType()) {
        case "Puzzle" :
            levelIDs.add(levelID);
            highestLevelID = levelID;
            bv.prepPuzzle();
            break;
        case "Lightning" :
            levelIDs.add(levelID);
            highestLevelID = levelID;
            bv.prepLightning();
            break;
        case "Release" :
            levelIDs.add(levelID);
            highestLevelID = levelID;
            bv.prepRelease();
            break;
    }
}