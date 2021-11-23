private void onInput(final orwell.proxy.zmq.ZmqMessageBOM zmqMessageBOM) {
    orwell.proxy.ProxyRobots.logback.debug("Setting controller Input to robot");
    final java.lang.String routingId = zmqMessageBOM.getRoutingId();
    if (robotsMap.isRobotRegistered(routingId)) {
        applyInputOnRobot(zmqMessageBOM, routingId);
    }else {
        orwell.proxy.ProxyRobots.logback.info((("RoutingID " + routingId) + " is not an ID of a registered robot"));
    }
}