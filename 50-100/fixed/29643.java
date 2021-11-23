public static ver0.Arena[] getAllArenas() {
    ver0.Arena[] ArenaArray = new ver0.Arena[2];
    for (int i = 0; i < (ArenaArray.length); i++) {
        ArenaArray[i] = new ver0.Arena((i + 1));
    }
    return ArenaArray;
}