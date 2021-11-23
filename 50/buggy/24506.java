@com.fasterxml.jackson.annotation.JsonIgnore
public synchronized org.cubyte.edumon.client.RoomState getRoomState() {
    org.cubyte.edumon.client.RoomState state = roomStateMap.get(room);
    if ((state != null) && (!(state.isOutdated()))) {
        return state;
    }
    return null;
}