public static boolean chance(int max, int percentage) {
    if (max < 1)
        return 0;
    
    return (me.mrCookieSlime.CSCoreLibPlugin.CSCoreLib.randomizer().nextInt(max)) <= percentage;
}