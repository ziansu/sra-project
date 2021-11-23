public data.TreeElement getSelectedTreeElement() {
    int index = jTable.getSelectedRow();
    if (index < 0)
        return null;
    
    return showSet.get(index).element;
}