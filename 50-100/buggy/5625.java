public void addToInventory(com.bayviewglen.zork.Items item) {
    boolean check = checkWeight(item);
    if (check) {
        inventory.put(item.getName(), item);
        weight += item.getWeight();
    }else
        if (!check) {
            java.lang.System.out.println("You only have one back! How do you plan to carry two backpacks?");
        }
    
}