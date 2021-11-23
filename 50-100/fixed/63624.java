public void updateClosestPill(gr.PacManAI.Tile pill) {
    if ((closestPill) == null) {
        closestPill = pill;
    }else
        if ((pill.dist(cur.getX(), cur.getY())) < (closestPill.dist(cur.getX(), cur.getY()))) {
            closestPill = pill;
        }
    
}