@java.lang.Override
public boolean invoke(org.stjs.javascript.Map<java.lang.String, java.lang.Object> variable) {
    com.nicktoony.screeps.RoomPosition position = new com.nicktoony.screeps.RoomPosition(((java.lang.Integer) (variable.$get("x"))), ((java.lang.Integer) (variable.$get("y"))), from.roomName);
    if (((position.x) != (to.x)) && ((position.y) != (to.y))) {
        position.createFlag(null, ColorTypes.COLOR_GREEN);
    }
    return true;
}