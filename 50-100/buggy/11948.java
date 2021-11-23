public boolean InspectInventory(java.lang.String object) {
    for (int col = 0; col < (playerInventory.length); col++) {
        if (playerInventory[col][0].toString().equals(object)) {
            return true;
        }
    }
    return false;
}