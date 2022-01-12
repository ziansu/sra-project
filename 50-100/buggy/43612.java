private void exploreCurrentPos(boolean[] wall) {
    for (int i = 0; i < (wall.length); i++) {
        if (wall[i]) {
            board.addWall(currNode, currNode.forward((((currentDir) + 1) % 4)));
        }else {
            board.addWay(currNode, currNode.forward((((currentDir) + i) % 4)));
        }
    }
    board.explore(currNode);
}