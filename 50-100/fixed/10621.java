private void excludeCols(final boolean[] checkedItems) {
    int i = 1;
    assert null != checkedItems;
    assert null != (this.templateModel);
    for (final boolean checkedItem : checkedItems) {
        if (checkedItem)
            this.templateModel.addExcludeCol(i);
        
        i++;
    }
}