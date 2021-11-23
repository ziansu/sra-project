public void addBodyCellToList(com.mygdx.game.Cell bodySegment) {
    bodySegment.setX(breadCrumbsList.get(length).getX());
    java.lang.System.out.println("");
    bodySegment.setY(breadCrumbsList.get(length).getY());
    bodySegment.setType("body");
    body.add(length, bodySegment);
}