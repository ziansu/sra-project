public static Node getNode(int x, int y) {
    return MazeMap.curr_map.get(((y * ((MazeMap.width) - 1)) + x));
}