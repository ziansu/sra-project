private void calculatePriceFalling() {
    pcbuilder.controllers.dto.PricePointData first = priceHistory.get(0);
    pcbuilder.controllers.dto.PricePointData last = priceHistory.get(((priceHistory.size()) - 1));
    if ((first.getPrice()) > (last.getPrice())) {
        setPriceFalling(true);
    }else {
        setPriceFalling(false);
    }
}