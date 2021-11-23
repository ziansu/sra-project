public void addMarker(com.android.yardsale.models.YardSale ys) {
    for (com.google.android.gms.maps.model.Marker m : com.android.yardsale.fragments.SaleMapFragment.markers)
        m.remove();
    
    if ((btFlip) != null)
        btFlip.setVisibility(View.GONE);
    
    com.android.yardsale.fragments.SaleMapFragment.yardSaleList = null;
    com.android.yardsale.fragments.SaleMapFragment.yardSale = ys;
    addYardSale(ys, false);
}