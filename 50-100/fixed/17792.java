boolean readMachineStatus() throws protocolException, transportException {
    machine.log.entry();
    if ((on_threshold) > 0) {
        float f = cfg.zb.get(zb).readAnalogZB(input);
        return machine.log.exit((f < (on_threshold) ? false : true));
    }
    return machine.log.exit(cfg.zb.get(zb).readZB(input));
}