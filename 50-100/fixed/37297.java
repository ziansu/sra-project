public static nl.tudelft.scrumbledore.level.PlayerAction invertAction(nl.tudelft.scrumbledore.level.PlayerAction action) {
    if (action != null) {
        switch (action) {
            case MoveRight :
                return nl.tudelft.scrumbledore.level.PlayerAction.MoveStop;
            case MoveLeft :
                return nl.tudelft.scrumbledore.level.PlayerAction.MoveStop;
            case Shoot :
                return nl.tudelft.scrumbledore.level.PlayerAction.ShootStop;
            default :
                return null;
        }
    }
    return null;
}