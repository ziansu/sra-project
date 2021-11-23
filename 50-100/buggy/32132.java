@java.lang.Override
public void update() {
    switch (this.subject.getState()) {
        case Referendum.OUVERT :
            core.Log.log("RadioCanadaObserver-update(); The receive state: Referendum.OUVERT was handle.");
            instance.debutElection();
        case Referendum.TERMINE :
            core.Log.log("RadioCanadaObserver-update(); The receive state: Referendum.TERMINE was handle.");
            instance.finElection();
        case 3 :
            core.Log.log("RadioCanadaObserver-update(); The receive state: Referendum.NEWVOTE was handle.");
            instance.unNouveauVote();
        default :
            core.Log.log((("RadioCanadaObserver-update(); The receive state: " + (this.subject.getState())) + " isn't handle."));
    }
}