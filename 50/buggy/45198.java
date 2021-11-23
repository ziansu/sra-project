public static void info(java.lang.String s, boolean stdout) {
    if ((water.util.Log._level) >= (water.util.Log.INFO))
        water.util.Log.write0(water.util.Log.INFO, stdout, s);
    
}