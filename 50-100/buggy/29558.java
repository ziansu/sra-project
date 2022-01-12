private void setLineSize(org.nschmidt.ldparteditor.helpers.SphereGL20 sp, org.nschmidt.ldparteditor.helpers.SphereGL20 sp_inv, float line_width1000, float line_width, float line_width_gl, org.eclipse.swt.widgets.Button btn) {
    final boolean useLegacyGL = (org.nschmidt.ldparteditor.workbench.WorkbenchManager.getUserSettingState().getOpenGLVersion()) == 20;
    org.nschmidt.ldparteditor.enums.View.lineWidth1000[0] = line_width1000;
    org.nschmidt.ldparteditor.enums.View.lineWidth[0] = line_width;
    org.nschmidt.ldparteditor.enums.View.lineWidthGL[0] = line_width_gl;
    if (useLegacyGL) {
        org.nschmidt.ldparteditor.enums.GL20Primitives.SPHERE = sp;
        org.nschmidt.ldparteditor.enums.GL20Primitives.SPHERE_INV = sp_inv;
    }
    compileAll();
    clickSingleBtn(btn);
}