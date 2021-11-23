private void applyInputOnRobot(orwell.proxy.zmq.ZmqMessageBOM input, java.lang.String routingId) {
    final orwell.proxy.IRobot targetedRobot = robotsMap.get(routingId);
    final orwell.proxy.RobotInputSetVisitor inputSetVisitor = new orwell.proxy.RobotInputSetVisitor(input.getMessageBodyBytes());
    orwell.proxy.ProxyRobots.logback.debug(inputSetVisitor.toString(targetedRobot));
    try {
        targetedRobot.accept(inputSetVisitor);
    } catch (orwell.proxy.MessageNotSentException e) {
        orwell.proxy.ProxyRobots.logback.error(e.getMessage());
        this.stop();
    }
}