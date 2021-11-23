public treinsimulator.Trein zoekTrein() {
    java.lang.System.out.println((("Reiziger met reis " + (reis)) + " zoekt een trein"));
    treinsimulator.Overstapdata data = huidigStation.juisteTrein(reis.getAantalOverstappen(), huidigStation, reis.getEindstation());
    volgendStation = data.getOverstap();
    treinsimulator.Trein trein = data.getTrein();
    return trein;
}