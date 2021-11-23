public void increment(battlecode.common.RobotType type) {
    RUfoo.managers.Channel.Channel typeChannel = channelForType(rc.getType());
    int count = 1 + (radio.readChannel(typeChannel));
    radio.broadcast(typeChannel, count);
}