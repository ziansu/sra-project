public static void main(java.lang.String[] args) {
    jp.hichain.prototype.ui.Main.init();
    jp.hichain.prototype.ui.Main.createPlayers();
    long start = java.lang.System.currentTimeMillis();
    jp.hichain.prototype.ui.Main.testChainSearch(Move.ROOT, AroundDir.NORTH);
    long end = java.lang.System.currentTimeMillis();
    java.lang.System.out.println(((end - start) + " ms"));
}