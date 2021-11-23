@java.lang.Override
public void getValue() {
    rawMoney = com.sungjae.app.showmethemoney.data.DataMap.readFloat(DataMapKey.MONEY_VALUE_RAW);
    coinValue = com.sungjae.app.showmethemoney.data.DataMap.readFloat(DataMapKey.COIN_AMOUNT);
    totalValue = com.sungjae.app.showmethemoney.data.DataMap.readFloat(DataMapKey.TOTAL_VALUE_RAW);
    enabled = com.sungjae.app.showmethemoney.activity.setting.ConfigurationConstants.getEnabledMoneyKeeper();
    requestToKeep = com.sungjae.app.showmethemoney.activity.setting.ConfigurationConstants.getKeepValueMoneyKeeper();
}