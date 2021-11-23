public boolean containsEquivalentColumn(uk.ac.ucl.excites.sapelli.storage.model.Column<?> column, boolean checkVirtual) {
    if (containsColumn(column, checkVirtual))
        return true;
    
    if (column == null)
        return false;
    
    uk.ac.ucl.excites.sapelli.storage.model.Column<?> myColumn = getColumn(column.getName(), checkVirtual);
    return (myColumn != null) && (myColumn.equals(column, false, true));
}