private void doSelectionChanged() {
    (adjusting)++;
    clearSelection();
    for (T proxy : sel_model.getSelected()) {
        int i = model.getIndex(proxy);
        if (i >= 0)
            super.addSelectionInterval(i, i);
        
    }
    (adjusting)--;
}