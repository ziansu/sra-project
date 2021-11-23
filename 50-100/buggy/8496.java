static boolean isLastWordInDirection(com.totsp.crossword.puz.Box[][] boxes, com.totsp.crossword.puz.Playboard.Word w) {
    if (w.across) {
        return ((w.start.down) + 1) >= (boxes[w.start.across].length);
    }
    return ((w.start.across) + 1) >= (boxes.length);
}