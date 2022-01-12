public void applyTranslation(org.nschmidt.ldparteditor.composites.Composite3D c3d) {
    if (modified) {
        c3d.getLockableDatFileReference().getVertexManager().transformSelection(accurateResult, null, org.nschmidt.ldparteditor.shells.editor3d.Editor3DWindow.getWindow().isMovingAdjacentData());
        org.nschmidt.ldparteditor.helpers.Manipulator.initialScaleOld = org.nschmidt.ldparteditor.helpers.Manipulator.initialScaleNew;
        org.nschmidt.ldparteditor.shells.editor3d.Editor3DWindow.getWindow().updateInitialScale(org.nschmidt.ldparteditor.helpers.Manipulator.initialScaleNew, org.nschmidt.ldparteditor.helpers.Manipulator.factor_Scale);
    }
    resetTranslation();
}