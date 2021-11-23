public void applyTranslation(org.nschmidt.ldparteditor.composites.Composite3D c3d) {
    if (modified) {
        c3d.getLockableDatFileReference().getVertexManager().transformSelection(accurateResult, null, org.nschmidt.ldparteditor.shells.editor3d.Editor3DWindow.getWindow().isMovingAdjacentData());
    }
    resetTranslation();
}