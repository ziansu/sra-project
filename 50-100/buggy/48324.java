@java.lang.Override
public void notifyIterationStarts(org.matsim.core.controler.events.IterationStartsEvent event) {
    int itr = event.getIteration();
    if ((this.initialMode2share.isEmpty()) && (itr == 0)) {
        event.getServices().getEvents().addHandler(modalShareEventHandler);
    }else
        if (((itr % (updateASCAfterIts)) == 0) && (itr <= (innovationStop))) {
            event.getServices().getEvents().addHandler(modalShareEventHandler);
        }
    
}