private int accentColorIndex() {
    int index = 0;
    for (int i = 0; i < (accentThemes().length); i++) {
        if ((mAccentColor) == (accentThemes()[i])) {
            index = i;
            break;
        }
    }
    return index;
}