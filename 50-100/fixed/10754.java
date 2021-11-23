@java.lang.Override
public void Process() {
    setAirplaneState(StateAirplane.LoadingPassagers);
    enstabretagne.base.time.LogicalDuration t = enstabretagne.base.time.LogicalDuration.ofSeconds((20 * 60));
    Post(new enstabretagne.SimEntity.airplane.Airplane.RollingToTrack(), getCurrentLogicalDate().add(t));
    enstabretagne.base.utility.Logger.Information(this.Owner(), "LoadingPassagers", Messages.LoadingPassagers);
}