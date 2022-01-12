public static com.growpi.arduino.Relay getRelayByNumber(final int the_relay) {
    com.growpi.arduino.Relay relay = null;
    if ((the_relay > 0) && (the_relay < (com.growpi.arduino.Relay.values().length))) {
        relay = com.growpi.arduino.Relay.values()[the_relay];
    }
    return relay;
}