public void changeBackground() {
    int previousN = n;
    n = rand.nextInt(8);
    if ((n) == previousN) {
        changeBackground();
    }
    java.lang.String backgroundPath;
    if (storeBool.getfxmlActive()) {
        backgroundPath = backgrounds.get(n);
    }else {
        backgroundPath = backgroundsLarge.get(n);
    }
    backgroundPane.setStyle((("-fx-background-image: url('" + backgroundPath) + "');"));
}