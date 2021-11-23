private void updatePiece() {
    setItemFields();
    presenter.updatePiece(editItem.getID().toString(), editItem, true);
}