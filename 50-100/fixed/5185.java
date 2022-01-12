public void addBodyCellToList(com.mygdx.game.Cell bodySegment) {
    bodySegment.setX(breadCrumbsList.get(length).getX());
    bodySegment.setY(breadCrumbsList.get(length).getY());
    bodySegment.setType("body");
    body.add(length, bodySegment);
}