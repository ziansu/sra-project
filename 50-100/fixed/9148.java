public static util.Coords fromSGFString(java.lang.String coords) {
    if (!(coords.matches("[a-s][a-s]")))
        throw new java.lang.IllegalArgumentException((("String: '" + coords) + "' is not recognizable as SGF coordinates."));
    
    int x = ((coords.charAt(0)) - 'a') + 1;
    int y = ((coords.charAt(1)) - 'a') + 1;
    return util.Coords.getCoords(x, y);
}