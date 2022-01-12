public void setState(boolean state) {
    this.state = state;
    try {
        ru.semiot.drivers.regulator.relay.Regulator.logger.info(ru.semiot.drivers.regulator.relay.Regulator.TEMPLATE_MSG.replace("${VAL}", (state ? ru.semiot.drivers.regulator.relay.Regulator.TURN_ON_ACTION : ru.semiot.drivers.regulator.relay.Regulator.TURN_OFF_ACTION)));
        client.put(ru.semiot.drivers.regulator.relay.Regulator.TEMPLATE_MSG.replace("${VAL}", (state ? ru.semiot.drivers.regulator.relay.Regulator.TURN_ON_ACTION : ru.semiot.drivers.regulator.relay.Regulator.TURN_OFF_ACTION)), 0);
    } catch (java.lang.RuntimeException ex) {
        ru.semiot.drivers.regulator.relay.Regulator.logger.error("Bad resource! Can't execute request! URI is {}.Exception message is {}", client.getURI(), ex.getMessage());
    }
}