@java.lang.Override
public void onCommand(java.lang.String cmd) {
    switch (cmd) {
        case "cmd_btnPlayerMarkerSelect" :
            {
                int firstUnreservedMarker = getFirstUnreservedMarker();
                if (firstUnreservedMarker > (-1)) {
                    com.semaphore_soft.apps.cypher.PortalClientActivity.clientService.write(((com.semaphore_soft.apps.cypher.networking.NetworkConstants.PREFIX_MARK_REQUEST) + firstUnreservedMarker));
                }
            }
        case "cmd_btnEndTurn" :
            moveActor();
            break;
        case "cmd_btnGenerateRoom" :
            generateRoom();
            break;
        case "cmd_btnOpenDoor" :
            openDoor();
            break;
        case "cmd_btnAttack" :
            break;
        case "cmd_btnDefend" :
            break;
        case "cmd_btnSpecial" :
            break;
    }
}