private void drawHeader() {
    java.lang.String headerString = "Fury Racers";
    int stringLength = Fonts.header.getWidth(headerString);
    float xPos = ((screenWidth) / 2) - (stringLength / 2);
    Fonts.header.drawString(xPos, ((screenHeight) / 15), "Fury Racers", Fonts.headerColor);
}