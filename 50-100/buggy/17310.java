public com.team1389.util.AddList<com.team1389.watch.Watchable> getSubWatchables(com.team1389.util.AddList<com.team1389.watch.Watchable> stem) {
    return stem.put(new com.team1389.watch.info.FlagInfo("port fault", () -> {
        return (!(port1.isPresent())) == (!(port2.isPresent()));
    }));
}