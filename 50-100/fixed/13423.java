public void complete(int newQuantity) {
    if ((type) == (OrderType.BUY)) {
        issuingTrader.transferMoneyOut(((newQuantity * (company.getSharePrice())) / 100), clientOwner);
        issuingTrader.addShares(newQuantity, company, clientOwner);
    }else {
        issuingTrader.transferMoneyIn(((newQuantity * (company.getSharePrice())) / 100), clientOwner);
        issuingTrader.subtractShares(newQuantity, company, clientOwner);
    }
    quantity -= newQuantity;
    complete = true;
}