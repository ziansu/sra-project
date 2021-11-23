@java.lang.Override
public void run() {
    try {
        listModel.clearSelection();
        walmart.WalmartConnection connection = new walmart.WalmartConnection();
        walmart.SearchResults results = connection.createWalmartConnection(searchInput.getText().trim());
        items = results.getItems();
        defaultLabel.setText("");
        listModel.setListData(items);
    } catch (java.io.IOException ex1) {
        searchInput.setText("");
    } catch (java.lang.NullPointerException ex2) {
        searchInput.setText("Renenter Search");
    }
}