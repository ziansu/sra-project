public boolean addToInventory(com.bayviewglen.zork.Items item) {
    boolean check = checkWeight(item);
    if (!check) {
        return false;
    }else {
        inventory.put(item.getName(), item);
        weight += item.getWeight();
        return true;
    }
}