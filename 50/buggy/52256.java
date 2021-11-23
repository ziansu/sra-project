public static void sortSprites() {
    for (int m = 0; m < (TRPG.TRPG.sprites.size()); m++) {
        TRPG.TRPG.sprites.get(m).updateDepthIndex();
    }
    java.util.Collections.sort(TRPG.TRPG.sprites);
}