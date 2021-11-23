public static void main(java.lang.String[] args) {
    jp.hichain.prototype.ui.Main.init();
    jp.hichain.prototype.ui.Main.createPlayers();
    long start = java.lang.System.currentTimeMillis();
    long end = java.lang.System.currentTimeMillis();
    java.lang.System.out.println(((end - start) + " ms"));
}