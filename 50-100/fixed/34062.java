@java.lang.Override
public void update(final org.eclipse.jface.viewers.ViewerCell cell) {
    final org.eclipse.core.resources.IFile file = ((org.eclipse.core.resources.IFile) (cell.getElement()));
    this.updateCellProperties(cell, file, this.createStyledText(file));
    super.update(cell);
}