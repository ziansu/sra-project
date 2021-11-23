private void HereIsMyChoice(java.lang.String choice) {
    Do(("Here Is My Choice : " + choice));
    wait.msgHereIsMyChoice(this, choice);
    for (restaurant.WaiterAgent.MyCustomer myC : wait.getMyCustomers()) {
        if ((myC.c) == (this)) {
            foodGui = new restaurant.gui.FoodGui(myC.t.tableNumber, fChoice);
            break;
        }
    }
    host.gui.animationPanel.addGui(foodGui);
    foodGui.state = FoodGui.State.waiting;
}