@java.lang.Override
public synchronized void next() {
    gui.disable();
    getContext().actorSelection(util.MessageHelper.getActorAddress(actors.BillingInfoNode.class)).tell(new actors.TravelInfoNode.TravelInfoNodeDone(travelInfo), self());
    getContext().actorSelection(util.MessageHelper.getActorAddress(actors.ProcessReservationNode.class)).tell(new actors.TravelInfoNode.TravelInfoNodeDone(travelInfo), self());
    super.next();
    self().tell(new actors.TravelInfoNode.Start(), self());
}