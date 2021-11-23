@java.lang.Override
public void insertIndexInterval(int index, int length, boolean before) {
    super.insertIndexInterval(index, length, before);
    for (int i = index; i < (index + length); i++) {
        T proxy = model.getProxy(i, false);
        if ((proxy != null) && (sel_model.isSelected(proxy)))
            super.addSelectionInterval(i, i);
        
    }
}