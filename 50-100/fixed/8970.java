public void changeDragonRight(android.view.View view) {
    if ((currDragon) == ((dragons.size()) - 1)) {
        currDragon = 0;
        addAccessory(dragons.get(currDragon));
    }else {
        currDragon += 1;
        addAccessory(dragons.get(currDragon));
    }
}