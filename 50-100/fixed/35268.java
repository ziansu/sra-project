public Environment.GraphVertex getShopCenterPosition(int shopNumber) {
    for (Environment.GraphVertex shopCenter : shopCenters) {
        if (shopCenter.getTypes().toString().contains((((SHOP) + shopNumber) + (SHOP_CENTER)))) {
            return searchForVertex(shopCenter.getWorldCoordinates());
        }
    }
    return null;
}