public void adShow() {
    android.widget.Toast.makeText(c, "РЕКЛАМА POWER!", Toast.LENGTH_SHORT).show();
    if ((tren.SportPit.BSprogramm.Ad.b) || ((tren.SportPit.BSprogramm.Ad.i) == 3)) {
        appoDeal();
        tren.SportPit.BSprogramm.Ad.i = 0;
        tren.SportPit.BSprogramm.Ad.b = false;
    }else
        tren.SportPit.BSprogramm.Ad.i = (tren.SportPit.BSprogramm.Ad.i) + 1;
    
    appoDealBanner();
}