public Environment.GraphVertex getShopCenterPosition(int shopNumber) {
    Environment.GraphVertex shopCenterPosition = null;
    for (Environment.GraphVertex shopCenter : shopCenters) {
        if (shopCenter.getTypes().toString().contains((((SHOP) + shopNumber) + (SHOP_CENTER)))) {
            shopCenterPosition = shopCenter;
            break;
        }
    }
    return searchForVertex(shopCenterPosition.getWorldCoordinates());
}