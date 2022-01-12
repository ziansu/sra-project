public static void getTotalMoney() {
    double totalPay = 0;
    for (com.xgf.winecome.entity.Goods goods : com.xgf.winecome.utils.CartManager.sCartList) {
        totalPay = totalPay + ((java.lang.Integer.parseInt(goods.getNum())) * (java.lang.Double.parseDouble(goods.getPrice())));
    }
    com.xgf.winecome.ui.activity.HomeActivity.modifyCartPayView(java.lang.String.valueOf(totalPay));
}