private void setKickoffTimes(model.LigaSaison lSeason) {
    defaultKickoffTimes = lSeason.getDefaultKickoffTimes();
    kickOffTimes = lSeason.getKickOffTimes();
    int lastKOT = defaultKickoffTimes[((defaultKickoffTimes.length) - 1)];
    while ((lastKOT + 1) < (kickOffTimes.size())) {
        kickOffTimes.remove(lastKOT);
    } 
}