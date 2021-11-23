@java.lang.Override
public java.awt.Color getNextColor() {
    if (((i) + 1) > (customPalette.size())) {
        reset();
        return getNextColor();
    }else {
        java.awt.Color c = customPalette.get(i);
        kg.apc.charting.colors.HueRotatePalette.log.debug(("Custom color c next: " + c));
        (i)++;
        return c;
    }
}