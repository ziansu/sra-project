public static int getPlayerX() throws java.lang.Exception {
    java.lang.Object playerObj = vampire.api.core.getField("myPlayer", Vampire.conf.getMainClass()).get(Vampire.mainInstance);
    int pX = ((int) (vampire.api.core.getMemberField(playerObj, "x")));
    int bX = vampire.api.core.getField("baseX", Vampire.conf.getMainClass()).getInt(Vampire.mainInstance);
    java.lang.System.out.println(bX);
    return (pX >> 7) + bX;
}