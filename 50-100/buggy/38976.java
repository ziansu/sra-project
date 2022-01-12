private int getRedeemPointsSelectedCount() {
    java.lang.Object x = ((java.util.HashMap) (appSession.getData("redeem_points"))).get("redeem_points");
    int count = 0;
    if (x != null) {
        java.util.List<com.bitdubai.fermat_dap_android_wallet_asset_user_bitdubai.models.RedeemPoint> redeemPoints = ((java.util.List<com.bitdubai.fermat_dap_android_wallet_asset_user_bitdubai.models.RedeemPoint>) (x));
        if ((redeemPoints.size()) > 0) {
            for (com.bitdubai.fermat_dap_android_wallet_asset_user_bitdubai.models.RedeemPoint redeemPoint : redeemPoints) {
                if (redeemPoint.isSelected()) {
                    count++;
                }
            }
        }
    }
    return count;
}