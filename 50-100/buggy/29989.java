@java.lang.Override
public enstabretagne.SimEntity.airport.Airport arriveAirport() {
    enstabretagne.SimEntity.airport.Airport a = findOpendAirport();
    setMyAirport(a);
    if (a != null) {
        setAirplaneState(StateAirplane.NotifyBeginArrive);
        enstabretagne.base.utility.Logger.Information(this, "NotifyBeginArrive", Messages.NotifyBeginArrive, this.getName());
        java.lang.System.out.println((("-------------------------" + (a.isTW2Full())) + "---------------------------"));
        waitTrackAndTW1(a);
        return a;
    }else {
        Post(new enstabretagne.SimEntity.airplane.Airplane.Departing(), getCurrentLogicalDate());
        return null;
    }
}