public void changeDragonLeft(android.view.View view) {
    if ((currDragon) == 0) {
        currDragon = (dragons.size()) - 1;
        addAccessory(dragons.get(currDragon));
    }else {
        currDragon -= 1;
        addAccessory(dragons.get(currDragon));
    }
    checkAchievements();
}