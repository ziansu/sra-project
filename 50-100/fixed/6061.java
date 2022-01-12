@java.lang.Override
public void refreshPanel() {
    reloadOrder();
    orderLinePanel.refreshPanel();
    actionPanel.refreshPanel();
    documentPanel.refreshPanel();
    if (!(hasLines())) {
        infoProductPanel.resetValues();
        quantityPanel.resetPanel();
        actionPanel.resetPanel();
    }
}