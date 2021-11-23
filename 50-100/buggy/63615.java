public void movePlayer(int roll) {
    for (int i = 0; i < roll; ++i) {
        int newLoc = (parent.players[currPlayer].getCurrLocation()) + 1;
        if (newLoc >= (parent.spaces.size())) {
            parent.players[currPlayer].passedGo();
        }
        parent.players[currPlayer].setCurrLocation((newLoc % (parent.spaces.size())));
        movePlayerIcon();
    }
}