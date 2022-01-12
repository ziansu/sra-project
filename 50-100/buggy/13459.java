public me.dags.daflight.util.Vector3d applyMovement(me.dags.daflight.util.Vector3d direction, me.dags.daflight.util.Rotation rotation) {
    if ((flying) && (!(me.dags.daflight.DaFlight.instance().config().disabled))) {
        moveFlying(direction, rotation);
        return direction;
    }else
        if ((sprinting) && (!(daFlight.config().disabled))) {
            moveSprinting(direction, rotation);
            return direction;
        }
    
    return direction;
}