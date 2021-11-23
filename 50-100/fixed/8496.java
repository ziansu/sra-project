static boolean isLastWordInDirection(com.totsp.crossword.puz.Box[][] boxes, com.totsp.crossword.puz.Playboard.Word w) {
    if (w.across) {
        return ((w.start.across) + (w.length)) >= (boxes.length);
    }
    return ((w.start.down) + (w.length)) >= (boxes[w.start.across].length);
}