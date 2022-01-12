public double[] getLoad(java.lang.String string) {
    double[] scaledLoad = new double[load.length];
    double multiplier = 1;
    if (string.equals("Lbf"))
        multiplier = 1 / 4.44822;
    
    for (int i = 0; i < (scaledLoad.length); i++) {
        scaledLoad[i] = (load[i]) * multiplier;
    }
    return scaledLoad;
}