public code.dalton.replen.ReplenChest getChestByName(java.lang.String name) {
    java.util.Iterator<code.dalton.replen.ReplenChest> itr = code.dalton.replen.ReplenChestManager.chests.iterator();
    while (itr.hasNext()) {
        code.dalton.replen.ReplenChest c = itr.next();
        if ((c.getName()) == name) {
            return c;
        }
    } 
    return null;
}