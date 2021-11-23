public void nextGroup() {
    if ((activeGroup.getTotalPoints()) >= (targetPoints)) {
        gameOver = true;
    }else {
        activeGroup = groups.get(((activeGroup.getId()) % (groups.size())));
    }
}