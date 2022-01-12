public Environment.GraphVertex getShopPosition(int shopNumber) {
    for (Environment.GraphVertex shop : shops) {
        if (shop.getTypes().toString().contains(((SHOP) + shopNumber))) {
            return searchForVertex(shop.getWorldCoordinates());
        }
    }
    return null;
}