private void rescaleMap() {
    hexRadius = ((int) ((defaultHexRadius) * (scale)));
    hexWidth = (hexRadius) * 2;
    hexHeight = ((int) ((hexRadius) * 1.748));
}