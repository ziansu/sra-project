private br.com.mvbos.etag.ui.EtagTextPane getSelected() {
    int sel = tabbedPane.getSelectedIndex();
    if (sel != (-1)) {
        return editors.get(sel);
    }
    return null;
}