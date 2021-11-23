private void startDrivingActors() {
    this.trackRecognizerActor = getContext().actorOf(akka.actor.Props.create(ch.hsr.whitespace.javapilot.akka.TrackRecognizerActor.class, getSelf(), new java.util.ArrayList<java.lang.String>(alreadyCheckedPatterns)));
    this.drivingCoordinatorActor = getContext().actorOf(akka.actor.Props.create(ch.hsr.whitespace.javapilot.akka.DrivingCoordinatorActor.class, getSelf(), properties.getInitialPower()));
}