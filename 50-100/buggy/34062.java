@java.lang.Override
public void update(final org.eclipse.jface.viewers.ViewerCell cell) {
    this.updateCellProperties(cell, ((org.eclipse.core.resources.IFile) (cell.getElement())), this.createStyledText(((org.eclipse.core.resources.IFile) (cell.getElement()))));
    super.update(cell);
}