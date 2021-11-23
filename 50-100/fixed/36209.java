public void drawRel(tram.Relation rel) {
    int nr = rel.takeFree();
    for (; (delay) != 0;) {
        delay = drawTram(rel, nr);
        try {
            java.lang.Thread.sleep(delay);
        } catch (java.lang.Exception e) {
        }
    }
}