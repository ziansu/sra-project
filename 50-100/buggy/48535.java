@java.lang.Override
public void handleClientRequest(com.smartfoxserver.v2.entities.User user, com.smartfoxserver.v2.entities.data.ISFSObject data) {
    nstuff.juggerfall.extension.pawn.Pawn pawn = ((nstuff.juggerfall.extension.pawn.Pawn) (((nstuff.juggerfall.extension.MainExtension) (getParentExtension())).viewManager.getView(data.getInt("pawnId"))));
    send(PawnHandlerManager.RequestName_RemoteDamageOnPawn, data, pawn.getOwner());
}