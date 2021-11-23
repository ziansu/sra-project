@java.lang.Override
public void handle(com.openrubicon.core.api.interactables.Interactable interactable, java.lang.String[] strings) {
    if (!(interactable instanceof com.openrubicon.core.api.interactables.Player))
        return ;
    
    com.openrubicon.core.api.interactables.Player thePlayer = ((com.openrubicon.core.api.interactables.Player) (interactable));
    com.openrubicon.social.classes.SocialProfile s = ((com.openrubicon.social.classes.SocialProfile) (RRPGSocial.social.getHashMap().get(thePlayer.getPlayer())));
    s.listRequests();
}