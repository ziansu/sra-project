public static int getRemainDays(java.lang.String playerName) {
    long interval = ((new java.util.Date().getTime()) + 2592000000L) - (cc.isotopestudio.Punctual.Punctual.plugin.getPlayersData().getLong((playerName + ".time")));
    return ((int) ((interval / (((1000 * 60) * 60) * 24)) + 1));
}