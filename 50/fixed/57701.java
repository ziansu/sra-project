public void act() {
    if (carryingFood) {
        walkTowardsHome();
        handlePheromoneDrop();
        checkHome();
    }else
        if (checkLiveStat()) {
            searchForFood();
        }
    
}