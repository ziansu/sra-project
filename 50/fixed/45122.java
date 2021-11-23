public int getTotalCostInOrderList() {
    int total = 0;
    for (application.Menu eachMenu : orderList) {
        total = total + (eachMenu.getMenuCost());
    }
    return total;
}