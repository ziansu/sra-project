public static void setTotalMoney(boolean isShow) {
    double totalPay = 0;
    for (com.xgf.winecome.entity.Goods goods : com.xgf.winecome.utils.CartManager.sCartList) {
        totalPay = totalPay + ((java.lang.Integer.parseInt(goods.getNum())) * (java.lang.Double.parseDouble(goods.getSalesPrice())));
    }
    if (0 == ((int) (totalPay))) {
        isShow = false;
    }
    com.xgf.winecome.ui.activity.HomeActivity.modifyMainPayView(java.lang.String.valueOf(totalPay), isShow);
}