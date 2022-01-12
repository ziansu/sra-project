@java.lang.Override
public cn.wisdom.lottery.service.remote.response.LotteryOpenData getCurrentPeriod(cn.wisdom.lottery.dao.constant.LotteryType lotteryType) {
    java.lang.String errMsg = java.text.MessageFormat.format("Failed to query {0} current period info.", lotteryType);
    cn.wisdom.lottery.dao.vo.PrizeLottery prizeLottery = daoHelper.queryForObject(cn.wisdom.lottery.dao.PrizeLotteryDaoImpl.GET_SSQ_CURRENT_PERIOD, cn.wisdom.lottery.dao.PrizeLotteryDaoImpl.ssqPrizeInfoMapper, errMsg);
    if ((prizeLottery != null) && ((prizeLottery.getOpenTime()) != null)) {
        java.sql.Timestamp openTime = prizeLottery.getOpenTime();
        unifyOpenTime(openTime);
        prizeLottery.setOpenTime(openTime);
    }
    return new cn.wisdom.lottery.service.remote.response.LotteryOpenData(prizeLottery);
}