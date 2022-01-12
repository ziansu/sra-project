private static void write(int lvl, java.lang.Object[] objs) {
    boolean writeToStdout = lvl <= (water.util.Log.currentLevel);
    water.util.Log.write0(lvl, writeToStdout, objs);
}