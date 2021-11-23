protected void interpretSignal(battlecode.common.Signal message) {
    int actionCode = (message.getMessage()[0]) % (trashboys.Radio.GROUP_SCALE);
    int messageCode = (message.getMessage()[0]) / (trashboys.Radio.GROUP_SCALE);
    switch (actionCode) {
        case trashboys.Radio.RALLY :
            owner.setDestination(decodeLocation(message.getMessage()[1]), decodeDestRange(messageCode));
            break;
    }
}