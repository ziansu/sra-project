public void setItemAmount(int amount, int index) {
    if ((vendStackHandler.getStackInSlot(index)) != null) {
        itemAmounts[index] = amount;
        if (amount == (-1)) {
            vendStackHandler.getStackInSlot(index).stackSize = 1;
        }else {
            vendStackHandler.getStackInSlot(index).stackSize = itemAmounts[index];
        }
    }
}