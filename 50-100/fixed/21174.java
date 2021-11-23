public static int getRemainDays(java.lang.String playerName) {
    long interval = ((cc.isotopestudio.Punctual.Punctual.plugin.getPlayersData().getLong((playerName + ".time"))) + 2592000000L) - (new java.util.Date().getTime());
    return ((int) ((interval / (((1000 * 60) * 60) * 24)) + 1));
}