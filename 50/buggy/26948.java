private void onGetDrugItemCompleted() {
    drugItemPb.setVisibility(View.GONE);
    setDrugItemUI(drugItem);
    getFiSize(drugItem.getFiUrl());
    getRcpSize(drugItem.getRcpUrl());
}