@java.lang.Override
protected void initViews(android.view.View layout) {
    super.initViews(layout);
    configureToolbar();
    noGroupsView = layout.findViewById(R.id.dap_wallet_asset_issuer_delivery_no_groups);
    digitalAsset = ((org.fermat.fermat_dap_android_wallet_asset_issuer.models.DigitalAsset) (appSession.getData("asset_data")));
    if ((swipeRefreshLayout) != null) {
        swipeRefreshLayout.post(new java.lang.Runnable() {
            @java.lang.Override
            public void run() {
                onRefresh();
            }
        });
    }
    showOrHideNoUsersView(groups.isEmpty());
}