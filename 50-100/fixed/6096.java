public void reset() {
    x = 0;
    y = 0;
    modelRep = new boolean[size][size];
    modelRep[yBathToModelRep(0)][xBathToModelRep(0)] = true;
    if ((modelUpdateListener) != null) {
        modelUpdateListener.reset();
    }
    currentRadius = 5;
}