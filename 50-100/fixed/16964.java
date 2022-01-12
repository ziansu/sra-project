private void layoutDialog() {
    org.eclipse.core.runtime.Assert.isNotNull(inputComposite);
    org.eclipse.swt.layout.GridData data = ((org.eclipse.swt.layout.GridData) (inputComposite.getLayoutData()));
    data.minimumWidth = 0;
    dialogParentComposite.pack();
    data.minimumWidth = fr.inria.soctrace.framesoc.ui.dialogs.AbstractLaunchToolDialog.MIN_TOOL_INPUT_COMPOSITE_WIDTH;
    dialogParentComposite.pack();
}