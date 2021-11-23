@java.lang.Override
public cn.wisdom.lottery.service.remote.response.LotteryOpenData getOpenInfo(cn.wisdom.lottery.dao.constant.LotteryType lotteryType, int period) {
    java.lang.String errMsg = java.text.MessageFormat.format("Failed to query {0} open info of period {1}.", lotteryType, period);
    cn.wisdom.lottery.dao.vo.PrizeLottery prizeLottery = daoHelper.queryForObject(cn.wisdom.lottery.dao.PrizeLotteryDaoImpl.GET_SSQ_PERIOD, cn.wisdom.lottery.dao.PrizeLotteryDaoImpl.ssqPrizeInfoMapper, errMsg, period);
    cn.wisdom.lottery.service.remote.response.LotteryOpenData result = null;
    if ((prizeLottery != null) && ((prizeLottery.getOpenTime()) != null)) {
        unifyOpenTime(prizeLottery.getOpenTime());
        result = new cn.wisdom.lottery.service.remote.response.LotteryOpenData(prizeLottery);
    }
    return result;
}