public static nl.tudelft.scrumbledore.level.PlayerAction invertAction(nl.tudelft.scrumbledore.level.Player player, nl.tudelft.scrumbledore.level.PlayerAction action) {
    if (action != null) {
        switch (action) {
            case MoveRight :
                player.removeAction(nl.tudelft.scrumbledore.level.PlayerAction.MoveRight);
                return nl.tudelft.scrumbledore.level.PlayerAction.MoveStop;
            case MoveLeft :
                player.removeAction(nl.tudelft.scrumbledore.level.PlayerAction.MoveLeft);
                return nl.tudelft.scrumbledore.level.PlayerAction.MoveStop;
            case Shoot :
                player.removeAction(nl.tudelft.scrumbledore.level.PlayerAction.Shoot);
                return nl.tudelft.scrumbledore.level.PlayerAction.ShootStop;
            case Jump :
                player.removeAction(nl.tudelft.scrumbledore.level.PlayerAction.Jump);
            default :
                return null;
        }
    }
    return null;
}