private void viewButtonActionPerformed(java.awt.event.ActionEvent evt) {
    if (((controllerListener) != null) && ((restaurantTable.getSelectedRow()) >= 0)) {
        com.group8.model.Restaurant selectedRestaurant = filteredRestaurants.get(restaurantTable.getSelectedRow());
        controllerListener.viewButtonClicked(selectedRestaurant);
    }
}