@java.lang.Override
public void notifyIterationStarts(org.matsim.core.controler.events.IterationStartsEvent event) {
    int itr = event.getIteration();
    if (itr == 0) {
        if (this.initialMode2share.isEmpty()) {
            event.getServices().getEvents().addHandler(modalShareEventHandler);
        }
    }else {
        if (((itr % (updateASCAfterIts)) == 0) && (itr <= (innovationStop))) {
            event.getServices().getEvents().addHandler(modalShareEventHandler);
        }
    }
}