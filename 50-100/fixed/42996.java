public java.lang.String validateRedeemedPoints(long redeemedPoints, double renderedCash, sg.edu.nus.iss.ssa.model.Order receipt) {
    long totalAvlPoints = ((receipt.getMemberInfo()) != null) ? receipt.getMemberInfo().getLoyaltyPoints() : 0;
    if (totalAvlPoints <= 0) {
        return null;
    }
    double finalCost = receipt.getFinalPrice();
    if (redeemedPoints > totalAvlPoints) {
        return (sg.edu.nus.iss.ssa.constants.StoreConstants.MAX_POINTS_REDEEMED_MSG) + totalAvlPoints;
    }
    if ((redeemedPoints % (sg.edu.nus.iss.ssa.constants.StoreConstants.CASH_EQ_POINTS)) != 0) {
        return sg.edu.nus.iss.ssa.constants.StoreConstants.POINTS_REDEEMED_CONSTRAINT;
    }
    return null;
}