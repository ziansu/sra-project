public void adShow() {
    if ((tren.SportPit.BSprogramm.Ad.b) || ((tren.SportPit.BSprogramm.Ad.i) == 3)) {
        appoDeal();
        tren.SportPit.BSprogramm.Ad.i = 0;
        tren.SportPit.BSprogramm.Ad.b = false;
    }else
        tren.SportPit.BSprogramm.Ad.i = (tren.SportPit.BSprogramm.Ad.i) + 1;
    
    appoDealBanner();
}