@java.lang.Override
public boolean invoke(org.stjs.javascript.Map<java.lang.String, java.lang.Object> variable) {
    createPath(startPosition, new com.nicktoony.screeps.RoomPosition(((java.lang.Integer) (variable.$get("x"))), ((java.lang.Integer) (variable.$get("y"))), startPosition.roomName), avoidPositions, true);
    return true;
}