public void checkRule12(java.lang.String platform, final com.order.databean.RulesCallback.RulesCallback callback) {
    if (((orderType) != 4) || ((java.lang.Integer.parseInt(platform)) == 6)) {
        return ;
    }
    if ((bookReadPv.size(lastUpdateTime)) == 0) {
        callback.hanleData(msisdnId, sessionId, lastUpdateTime, realInfoFee, channelId, productId, Rules.TWELVE.name(), provinceId, orderType, bookId);
    }
}