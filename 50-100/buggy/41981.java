public void btnAdd_clickAction(javafx.event.ActionEvent e) {
    for (com.abm.models.Product p : ((javafx.collections.ObservableList<com.abm.models.Product>) (tvProducts.getSelectionModel().getSelectedItems()))) {
        if (!(selected.contains(p))) {
            selected.add(p);
        }
    }
    tv_fill(tvProductsSelected, selected);
}