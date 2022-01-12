public boolean containsEquivalentColumn(uk.ac.ucl.excites.sapelli.storage.model.Column<?> column, boolean checkVirtual) {
    if (containsColumn(column, checkVirtual))
        return true;
    
    uk.ac.ucl.excites.sapelli.storage.model.Column<?> myColumn = (column != null) ? getColumn(column.getName(), checkVirtual) : null;
    return (myColumn != null) && (myColumn.equals(column, false, true));
}