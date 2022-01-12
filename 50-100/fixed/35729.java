private static tetris.Piece makeFastRotations(tetris.Piece root) {
    tetris.Piece curr = root.computeNextRotation();
    root.next = curr;
    while (!(root.equals(curr))) {
        curr.next = curr.computeNextRotation();
        curr = curr.next;
    } 
    curr.next = root.next;
    return root;
}