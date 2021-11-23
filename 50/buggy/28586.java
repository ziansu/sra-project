private void renderPolyhedron(de.lathanda.eos.robot.geom3d.Polyhedron poly, java.awt.Color base, com.jogamp.opengl.GL2 gl) {
    de.lathanda.eos.robot.gui.GLObjectBuffer.get(poly).render(base, gl);
}