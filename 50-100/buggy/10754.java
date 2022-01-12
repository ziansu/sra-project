@java.lang.Override
public void Process() {
    setAirplaneState(StateAirplane.LoadingPassagers);
    enstabretagne.base.time.LogicalDuration t = enstabretagne.base.time.LogicalDuration.ofSeconds((20 * 60));
    Post(new enstabretagne.SimEntity.airplane.Airplane.RollingToTrack(), getCurrentLogicalDate().add(t));
    java.lang.System.out.println(("getWaitTrackList in loading passagers" + (getMyAirport().getWaitTrackList())));
    enstabretagne.base.utility.Logger.Information(this.Owner(), "LoadingPassagers", Messages.LoadingPassagers);
}