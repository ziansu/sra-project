protected boolean isTreeColumn(int columnIndex) {
    if ((this.treeLayer) != null) {
        int columnPosition = this.treeLayer.getColumnPositionByIndex(columnIndex);
        org.eclipse.nebula.widgets.nattable.layer.cell.ILayerCell cell = this.treeLayer.getCellByPosition(columnPosition, 0);
        if (cell != null) {
            return cell.getConfigLabels().hasLabel(TreeLayer.TREE_COLUMN_CELL);
        }
    }
    return false;
}