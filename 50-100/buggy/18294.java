@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    for (org.nschmidt.ldparteditor.opengl.OpenGLRenderer renderer : org.nschmidt.ldparteditor.shells.editor3d.Editor3DWindow.renders) {
        org.nschmidt.ldparteditor.composites.Composite3D c3d = renderer.getC3D();
        if (c3d.getLockableDatFileReference().equals(org.nschmidt.ldparteditor.project.Project.getFileToEdit())) {
            org.nschmidt.ldparteditor.data.VertexManager vm = c3d.getLockableDatFileReference().getVertexManager();
            vm.addSnapshot();
            sels.setScope(SelectorSettings.EVERYTHING);
            loadSelectorSettings();
            vm.selector(sels);
            vm.syncWithTextEditors(true);
        }
    }
}