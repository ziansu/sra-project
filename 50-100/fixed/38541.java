public void addMarker(com.android.yardsale.models.YardSale ys) {
    if ((com.android.yardsale.fragments.SaleMapFragment.markers) != null) {
        for (com.google.android.gms.maps.model.Marker m : com.android.yardsale.fragments.SaleMapFragment.markers)
            m.remove();
        
    }else {
        com.android.yardsale.fragments.SaleMapFragment.markers = new java.util.ArrayList<>();
    }
    if ((btFlip) != null)
        btFlip.setVisibility(View.GONE);
    
    com.android.yardsale.fragments.SaleMapFragment.yardSaleList = null;
    com.android.yardsale.fragments.SaleMapFragment.yardSale = ys;
    addYardSale(ys, false);
}