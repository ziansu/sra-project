@java.lang.Override
protected java.lang.String getMessage(de.simonsator.partyandfriends.api.pafplayers.OnlinePAFPlayer pPlayer) {
    java.lang.String identifier;
    if ((pPlayer.getSettingsWorth(0)) == 0) {
        identifier = "Friends.Command.Settings.PartyInvitedByEveryone";
    }else {
        identifier = "Friends.Command.Settings.PartyInvitedByFriends";
    }
    return de.simonsator.partyandfriends.main.Main.getInstance().getMessagesYml().getString(identifier);
}