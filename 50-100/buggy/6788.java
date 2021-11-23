@java.lang.Override
public void processReservation(commonosgi.model.TravelInfo travelInfo) {
    if (queue.isEmpty()) {
        this.travelInfo = travelInfo;
        commonosgi.util.NodeBehavior.processReservationBehavior(this.travelInfo);
        gui.notify(travelInfo, null);
        gui.enable();
    }else {
        queue.add(travelInfo);
    }
}