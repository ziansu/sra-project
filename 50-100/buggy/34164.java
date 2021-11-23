@java.lang.Override
public void update() {
    if ((mRequestToKeep) > (mRawMoney)) {
        mRequestToKeep = mRawMoney;
        com.sungjae.app.showmethemoney.data.DataMap.writeString(DataMapKey.ERROR_TOAST_CONTENT, ("not enough money = " + ((mRequestToKeep) - (mRawMoney))));
    }
    java.lang.Float availMoney = (mRawMoney) - (mRequestToKeep);
    com.sungjae.app.showmethemoney.data.DataMap.writeFloat(DataMapKey.MONEY_VALUE_AVAIL, availMoney);
    java.lang.Float availTotal = availMoney + (mCoinValue);
    com.sungjae.app.showmethemoney.data.DataMap.writeFloat(DataMapKey.TOTAL_VALUE_AVAIL, availTotal);
}