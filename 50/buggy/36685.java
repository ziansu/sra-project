public static synchronized int increaseSequence() {
    return kr.usis.u_drone.StateBuffer.sequence = ((kr.usis.u_drone.StateBuffer.sequence)++) % 256;
}