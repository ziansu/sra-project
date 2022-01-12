public void drawRel(tram.Relation rel) {
    int nr = rel.takeFree();
    try {
        for (; ((delay) != 0) && ((stop) == 0);) {
            delay = drawTram(rel, nr);
            java.lang.Thread.sleep(delay);
        }
    } catch (java.lang.Exception e) {
        java.lang.System.out.print(e);
    }
}