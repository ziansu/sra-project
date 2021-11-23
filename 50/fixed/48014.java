public void addMarker(com.android.yardsale.models.YardSale ys) {
    if ((btFlip) != null)
        btFlip.setVisibility(View.GONE);
    
    com.android.yardsale.fragments.SaleMapFragment.yardSaleList = null;
    com.android.yardsale.fragments.SaleMapFragment.yardSale = ys;
    addYardSale(ys, false);
}