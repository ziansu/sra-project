public long getMatchTime() {
    return ((this.config.getInt(20, "sv_matchtime")) * 60) * 1000L;
}