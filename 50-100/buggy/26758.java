public void displayTopScore() {
    print(topScore);
    java.lang.String s = str(topScore);
    fill(28, 28, 28);
    textFont(loadFont("BebasNeue-100.vlw"));
    text(s, (((screenWidth) - (textWidth(s))) / 2), (((screenHeight) / 4) + 50));
}