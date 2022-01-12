public void widgetSelected(org.eclipse.swt.events.SelectionEvent e) {
    multiFileSelection = useFiles.getSelection();
    org.dawb.common.ui.util.GridUtils.setVisible(multiFilesLabel, multiFileSelection);
    setFileChoosingEnabled((!(multiFileSelection)));
    org.dawb.common.ui.util.GridUtils.setVisible(filter, multiFileSelection);
    org.dawb.common.ui.util.GridUtils.setVisible(extensions, multiFileSelection);
}