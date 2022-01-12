private void relaxHoriz(int i, int j) {
    int x = i / (height());
    int y = i % (height());
    double newP = (distTo[i]) + (energy(x, y));
    if ((distTo[j]) > newP) {
        distTo[j] = newP;
        indexTo[j] = i;
    }
}