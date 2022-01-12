int readChannel(int channel) {
    int msg = 0;
    try {
        msg = rc.readBroadcast(RUfoo.managers.Radio.TREE_CHANNEL);
    } catch (battlecode.common.GameActionException e) {
    }
    return msg;
}