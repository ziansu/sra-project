private void doSelectionChanged() {
    (adjusting)++;
    clearSelection();
    for (T proxy : sel_model.getSelected()) {
        int i = model.getIndex(proxy, false);
        if (i >= 0)
            super.addSelectionInterval(i, i);
        
    }
    (adjusting)--;
}