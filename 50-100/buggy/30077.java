public java.lang.Object getSelectedValue() {
    if (((getSelectedRow()) != (-1)) && ((getSelectedColumn()) != (-1)))
        return model.getValueAt(getSelectedRow(), getSelectedColumn());
    else
        return null;
    
}