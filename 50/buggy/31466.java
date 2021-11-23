public static com.iluwatar.IvoryTower getInstance() {
    if ((com.iluwatar.IvoryTower.instance) == null) {
        com.iluwatar.IvoryTower.instance = IvoryTower();
    }
    return com.iluwatar.IvoryTower.instance;
}