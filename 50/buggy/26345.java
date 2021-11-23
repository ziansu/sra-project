private boolean findMatch(eic.beike.projectx.model.UserEvent e) {
    eic.beike.projectx.busdata.BusData d = busCollector.getBusData(e.timeStamp, e.sensor);
    return (d.getSensor()) == (e.sensor);
}