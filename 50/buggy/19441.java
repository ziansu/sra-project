public torcs.scr.Action control(torcs.scr.SensorModel m) {
    this.model = m;
    status.updateStatus(this);
    temp.update(m);
    status.computeAction(action, this);
    return action;
}