@java.lang.Override
public void actionPerformed(java.awt.event.ActionEvent arg0) {
    try {
        mainViewModel = mainPanel.getViewModel();
        mainPanelTableMouseActivator = true;
        mainViewModel.setTableModel(createDatumTableModel());
        mainPanel.setViewModel(mainViewModel);
        for (int i = 0; i < (columnNames.length); i++) {
            mainPanel.setCellRenderer(i);
        }
        mainPanel.resizeColumnWidth();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}