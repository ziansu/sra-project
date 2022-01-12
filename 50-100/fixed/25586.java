public boolean getBanAction(int itemID, int inv) {
    if (!(config.contains((((inv + ".items.") + itemID) + ".ban")))) {
        return false;
    }
    if ((config.getBoolean((((inv + ".items.") + itemID) + ".ban"))) == true) {
        return true;
    }else {
        return false;
    }
}