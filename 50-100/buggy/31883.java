private void refresh(boolean rebuild) {
    if (((combo) != null) && (!(combo.isDisposed()))) {
        refreshCombo(rebuild);
    }else
        if (((fMenu) != null) && (!(fMenu.isDisposed()))) {
            refreshMenu(rebuild);
        }
    
}