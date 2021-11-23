public onefengma.demo.server.model.product.HandingBuy generateBuy() {
    onefengma.demo.server.model.product.HandingBuy handingBuy = new onefengma.demo.server.model.product.HandingBuy();
    handingBuy.id = onefengma.demo.common.IdUtils.id();
    handingBuy.handingType = handingType;
    handingBuy.message = message;
    handingBuy.souCityId = souCityId;
    handingBuy.userId = getUserId();
    handingBuy.pushTime = java.lang.System.currentTimeMillis();
    handingBuy.timeLimit = (handingBuy.pushTime) + ((timeLimit) * 1000);
    return handingBuy;
}