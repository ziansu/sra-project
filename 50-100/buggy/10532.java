@java.lang.Override
public void calculateRedpacksPrize(cn.wisdom.lottery.dao.vo.Lottery lottery) {
    if (cn.wisdom.lottery.common.utils.CollectionUtils.isNotEmpty(lottery.getRedpacks())) {
        int totalBonus = lottery.getPeriods().get(0).getPrizeBonus();
        int bonus = 0;
        for (cn.wisdom.lottery.dao.vo.LotteryRedpack lotteryRedpack : lottery.getRedpacks()) {
            bonus = (totalBonus * (lotteryRedpack.getRate())) / 100;
            lotteryRedpack.setPrizeBonus(bonus);
        }
    }
}