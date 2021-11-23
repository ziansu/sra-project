private void refreshQuantity() {
    minusButton.setAbled(((availableQuantity) > 0));
    plusButton.setAbled(((availableQuantity) < (hotelRoom.totalQuantity)));
    availableQuantityLabel.setText(((availableQuantity) + ""));
}