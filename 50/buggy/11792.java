public void saveUser() {
    user.setInventory(inventory);
    globalEnv.setOwner(user);
    globalEnv.saveInstance(this);
}