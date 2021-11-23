public void applyTranslation(org.nschmidt.ldparteditor.composites.Composite3D c3d) {
    if (modified) {
        c3d.getLockableDatFileReference().getVertexManager().transformSelection(accurateResult, null, org.nschmidt.ldparteditor.shells.editor3d.Editor3DWindow.getWindow().isMovingAdjacentData());
        modified = false;
    }
    accurateResult = org.nschmidt.ldparteditor.enums.View.ACCURATE_ID;
    accurateScale = org.nschmidt.ldparteditor.enums.View.ACCURATE_ID;
    org.lwjgl.util.vector.Matrix4f.setIdentity(result);
    org.lwjgl.util.vector.Matrix4f.setIdentity(scale);
}