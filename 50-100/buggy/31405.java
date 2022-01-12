@java.lang.Override
public cn.wisdom.lottery.service.remote.response.LotteryOpenData getOpenInfo(cn.wisdom.lottery.dao.constant.LotteryType lotteryType, int period) {
    java.lang.String errMsg = java.text.MessageFormat.format("Failed to query {0} open info of period {1}.", lotteryType, period);
    cn.wisdom.lottery.dao.vo.PrizeLottery prizeLottery = daoHelper.queryForObject(cn.wisdom.lottery.dao.PrizeLotteryDaoImpl.GET_SSQ_PERIOD, cn.wisdom.lottery.dao.PrizeLotteryDaoImpl.ssqPrizeInfoMapper, errMsg, period);
    if ((prizeLottery != null) && ((prizeLottery.getOpenTime()) != null)) {
        java.sql.Timestamp openTime = prizeLottery.getOpenTime();
        unifyOpenTime(openTime);
        prizeLottery.setOpenTime(openTime);
    }
    return new cn.wisdom.lottery.service.remote.response.LotteryOpenData(prizeLottery);
}