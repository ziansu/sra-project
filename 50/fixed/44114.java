void addToInventory(Group_Project_Bork.Item item) {
    this.inventory.add(item);
    currentWeight += item.getWeight();
}