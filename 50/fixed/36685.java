public static synchronized int increaseSequence() {
    (kr.usis.u_drone.StateBuffer.sequence)++;
    kr.usis.u_drone.StateBuffer.sequence = (kr.usis.u_drone.StateBuffer.sequence) % 256;
    return kr.usis.u_drone.StateBuffer.sequence;
}