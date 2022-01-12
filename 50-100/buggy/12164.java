public com.example.nils.grocerylist.Item findBestItem(java.util.ArrayList<com.example.nils.grocerylist.Item> list) {
    com.example.nils.grocerylist.HealthLogic healthLogic = new com.example.nils.grocerylist.HealthLogic(list);
    if ((mode) == 1) {
        return healthLogic.getCheapestItem();
    }
    if ((mode) == 2) {
        return healthLogic.getHealthiestItem();
    }
    return null;
}