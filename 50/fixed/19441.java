public torcs.scr.Action control(torcs.scr.SensorModel m) {
    this.model = m;
    status.updateStatus(this);
    java.lang.System.out.println(status);
    temp.update(m);
    status.computeAction(action, this);
    return action;
}