public void addQuad(java.awt.Point a, java.awt.Point b, java.awt.Point c, java.awt.Point d) {
    de.vf.logic.Quad q = new de.vf.logic.Quad(a, b, c, d);
    java.lang.System.out.println(q.toString());
    quads.add(q);
}