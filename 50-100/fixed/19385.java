@java.lang.Override
public void run() {
    searchPanel.setVisible(false);
    queryHeaderPanel.setVisible(true);
    tableHeaderPanel.setVisible(true);
    filterComboBox.setVisible(true);
    filterLabel.setVisible(true);
    tablePanel.setVisible(true);
    nameLabel.setText(name);
    setLastRefresh(lastRefresh);
}