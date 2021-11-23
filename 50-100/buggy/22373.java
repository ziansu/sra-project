@java.lang.Override
public void update() {
    if ((enabled) == false)
        return ;
    
    if ((requestToKeep) > (rawMoney)) {
        requestToKeep = rawMoney;
        com.sungjae.app.showmethemoney.data.DataMap.writeString(DataMapKey.ERROR_TOAST_CONTENT, ("not enough money = " + ((requestToKeep) - (rawMoney))));
    }
    java.lang.Float availMoney = (rawMoney) - (requestToKeep);
    com.sungjae.app.showmethemoney.data.DataMap.writeFloat(DataMapKey.MONEY_VALUE_AVAIL, availMoney);
    java.lang.Float availTotal = availMoney + (coinValue);
    com.sungjae.app.showmethemoney.data.DataMap.writeFloat(DataMapKey.TOTAL_VALUE_AVAIL, availMoney);
}