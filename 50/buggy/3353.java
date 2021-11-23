public void draw_textured(org.nschmidt.ldparteditor.composites.Composite3D c3d) {
    for (org.nschmidt.ldparteditor.data.GData3 tri : result.keySet()) {
        tri.drawBFC_Textured(c3d);
    }
}