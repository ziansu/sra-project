private void saveToModel() {
    prefs.setUseDefaultCommand(b_cmdFromPath.getSelection());
    java.lang.String command = t_cmd.getText().trim();
    prefs.setCommand(command);
    final org.eclipse.jface.viewers.IStructuredSelection sel = ((org.eclipse.jface.viewers.IStructuredSelection) (c_generator.getSelection()));
    prefs.setGenerator(((de.marw.cdt.cmake.core.internal.CmakeGenerator) (sel.getFirstElement())));
}