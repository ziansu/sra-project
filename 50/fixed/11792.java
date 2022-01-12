public void saveUser() {
    if ((state) == 1) {
        user.setInventory(inventory);
        globalEnv.setOwner(user);
        globalEnv.saveInstance(this);
    }
}