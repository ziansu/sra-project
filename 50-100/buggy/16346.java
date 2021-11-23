public Environment.GraphVertex getShopPosition(int shopNumber) {
    Environment.GraphVertex shopPosition = null;
    for (Environment.GraphVertex shop : shops) {
        if (shop.getTypes().toString().contains(((SHOP) + shopNumber))) {
            shopPosition = shop;
            break;
        }
    }
    return searchForVertex(shopPosition.getWorldCoordinates());
}