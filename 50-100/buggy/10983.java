public Move makeMove(BoardAndRack bar) {
    java.lang.System.out.println("Input word including tiles on board, ex. \"DOG\"");
    java.lang.String word = getNextLine();
    java.lang.System.out.println("Input starting position (leftmost or topmost) including tiles on board ex. \"(1,3)\"");
    Position p = new Position(getNextLine());
    java.lang.System.out.println("Is horizontal move? Y/N ex. \"Y\"");
    boolean isHorizontal = s.nextLine().equals("Y");
    Move m = bar.board.convertToMove(new PossibleMove(word, p.x, p.y, isHorizontal));
    return m;
}