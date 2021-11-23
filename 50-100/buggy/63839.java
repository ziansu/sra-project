private boolean numberSetIsCovered(aeneas.models.ReleaseNumber.Color color) {
    for (aeneas.models.ReleaseNumber n : board.getNumbers()) {
        if (((n.color) == color) && ((board.getPieceAtLocation(n.row, n.col)) != null)) {
            return false;
        }
    }
    return true;
}