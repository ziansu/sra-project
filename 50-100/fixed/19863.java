public void checkRule8(java.lang.String bookId, final com.order.databean.RulesCallback.RulesCallback callback) {
    if ((orderType) != 2) {
        return ;
    }
    int orderPvs = bookOrderPv.sizeOfBookOrderTimesWithOrderType(bookId, 2);
    int readPvs = bookReadPv.sizeWithTimeThreshold(bookId, lastUpdateTime, Constant.FIVE_MINUTES);
    if ((orderPvs >= 10) && (readPvs <= (2 * orderPvs))) {
        callback.hanleData(msisdnId, sessionId, lastUpdateTime, realInfoFee, channelId, productId, Rules.EIGHT.name(), provinceId, orderType, bookId);
    }
}