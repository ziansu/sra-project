public static java.lang.String getNextColour() {
    if ((com.shobute.arbigo.common.Colour.id) == (com.shobute.arbigo.common.Colour.colours.length)) {
        com.shobute.arbigo.common.Colour.id = 0;
    }
    return com.shobute.arbigo.common.Colour.colours[((com.shobute.arbigo.common.Colour.id)++)];
}