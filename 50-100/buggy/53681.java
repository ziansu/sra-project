private com.bio.pojo.Cell populateCell(int diagScore, int horScore, int verScore) {
    int maxScore = 0;
    com.bio.pojo.Direction dir = null;
    if (maxScore < diagScore) {
        maxScore = diagScore;
        dir = com.bio.pojo.Direction.DIAGONAL;
    }
    if (maxScore < verScore) {
        maxScore = verScore;
        dir = com.bio.pojo.Direction.TOP;
    }
    if (maxScore < horScore) {
        maxScore = horScore;
        dir = com.bio.pojo.Direction.LEFT;
    }
    return new com.bio.pojo.Cell(maxScore, dir);
}