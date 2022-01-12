public boolean getBanAction(int itemID, int inv) {
    if (!(config.contains((((inv + ".items.") + itemID) + ".ban")))) {
        return false;
    }
    return (config.getBoolean((((inv + ".items.") + itemID) + ".ban"))) == true;
}