public static int size() {
    int i = 0;
    for (at.sbc.firework.entities.EnumParts p : at.sbc.firework.entities.EnumParts.values()) {
        i++;
    }
    return i;
}