public void updateCurImage() {
    curImage = mapImage.getSubimage(curX, curY, PokemonGame.PANEL_WIDTH, PokemonGame.PANEL_HEIGHT);
    java.lang.System.out.println(("mX: " + (mX)));
    java.lang.System.out.println(("mY: " + (mY)));
    java.lang.System.out.println(("Current matrix value: " + (mapMatrix[mY][mX])));
}