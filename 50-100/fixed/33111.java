public void input() {
    switch (movementState) {
        case fizzion.tenebrae.entities.Player.IDLE :
            readMovement();
            break;
        case fizzion.tenebrae.entities.Player.MOVING :
            readMovement();
            break;
        case fizzion.tenebrae.entities.Player.CHARGING :
            if ((input.getKeyDown("charge")) || (((engine.utility.Time.getTime()) - (chargeStart)) > 0.5))
                movementState = fizzion.tenebrae.entities.Player.IDLE;
            
            break;
    }
}