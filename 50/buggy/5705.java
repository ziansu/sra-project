public static void modifyCartPayView(java.lang.String totalPrice) {
    com.xgf.winecome.ui.activity.HomeActivity.mCartTotalMoneyTv.setText(totalPrice);
    if ((java.lang.Double.parseDouble(totalPrice)) > 0) {
        com.xgf.winecome.ui.activity.HomeActivity.showOrhHideCartPayBar(true);
    }
}