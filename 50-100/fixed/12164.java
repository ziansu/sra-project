private com.example.nils.grocerylist.Item findBestItem(java.util.ArrayList<com.example.nils.grocerylist.Item> list) {
    com.example.nils.grocerylist.HealthLogic healthLogic = new com.example.nils.grocerylist.HealthLogic(list);
    switch (mode) {
        case 1 :
            return healthLogic.getCheapestItem();
        case 2 :
            return healthLogic.getHealthiestItem();
        default :
            return null;
    }
}