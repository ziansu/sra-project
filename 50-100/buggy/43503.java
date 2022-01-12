private void setKickoffTimes(model.LigaSaison lSeason) {
    defaultKickoffTimes = lSeason.getDefaultKickoffTimes();
    kickOffTimes = lSeason.getKickOffTimes();
    int lastKOT = defaultKickoffTimes[((defaultKickoffTimes.length) - 1)];
    log(("Es waren mal " + (kickOffTimes.size())));
    while ((lastKOT + 1) < (kickOffTimes.size())) {
        kickOffTimes.remove(lastKOT);
    } 
    log(("Hier sind es noch " + (kickOffTimes.size())));
}