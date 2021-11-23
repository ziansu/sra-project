@java.lang.Override
public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    for (org.nschmidt.ldparteditor.opengl.OpenGLRenderer renderer : org.nschmidt.ldparteditor.shells.editor3d.Editor3DWindow.renders) {
        org.nschmidt.ldparteditor.composites.Composite3D c3d = renderer.getC3D();
        org.nschmidt.ldparteditor.data.DatFile df = c3d.getLockableDatFileReference();
        if ((df.equals(org.nschmidt.ldparteditor.project.Project.getFileToEdit())) && (!(df.isReadOnly()))) {
            org.nschmidt.ldparteditor.data.VertexManager vm = df.getVertexManager();
            vm.addSnapshot();
            vm.meshReduce();
            regainFocus();
            return ;
        }
    }
    regainFocus();
}