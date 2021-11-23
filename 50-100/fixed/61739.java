private void checkBoardForIntersection(com.ragego.engine.Intersection intersection) {
    if ((intersection.getBoard()) != (this)) {
        java.lang.System.err.println(("Intersection is on board " + (intersection.getBoard())));
        java.lang.System.err.println(("and you are on board " + (this)));
    }
}