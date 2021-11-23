public void importPuzzle(puzzlePackage.PuzzleData p, java.util.ArrayList<puzzlePackage.PuzzleData> puzzles, java.util.ArrayList<java.lang.String> puzzleNames) {
    boolean flag = true;
    for (puzzlePackage.PuzzleData puzzle : puzzlesData)
        if (puzzle.getName().equals(p.getName())) {
            java.lang.System.out.println("This Puzzle already exists");
            flag = false;
            break;
        }
    
    if (flag) {
        puzzles.add(p);
        puzzlesNames.add(p.getName());
        loadsave.save(puzzles);
    }
}