public void calculate() {
    long startTime = java.lang.System.nanoTime();
    surface.fillWater(getWaterFillMethod(), null);
    calculationTime = (java.lang.System.nanoTime()) - startTime;
    updateBarModel();
}