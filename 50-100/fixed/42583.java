private void HereIsMyChoice(java.lang.String choice) {
    Do(("Here Is My Choice : " + choice));
    for (restaurant.WaiterAgent.MyCustomer myC : wait.getMyCustomers()) {
        if ((myC.c) == (this)) {
            foodGui = new restaurant.gui.FoodGui(myC.t.tableNumber, fChoice);
            break;
        }
    }
    wait.msgHereIsMyChoice(this, choice);
    host.gui.animationPanel.addGui(foodGui);
    foodGui.state = FoodGui.State.waiting;
}