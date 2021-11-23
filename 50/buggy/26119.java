public void draw(org.nschmidt.ldparteditor.composites.Composite3D c3d) {
    for (org.nschmidt.ldparteditor.data.GData3 tri : result.keySet()) {
        tri.draw(c3d);
    }
}