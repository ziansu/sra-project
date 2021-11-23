@java.lang.Override
public mmud.database.entities.game.DisplayInterface run(java.lang.String command, mmud.database.entities.characters.User aUser) throws mmud.exceptions.MudException {
    mmud.rest.services.LogBean logBean = getLogBean();
    mmud.database.entities.game.Guild guild = aUser.getGuild();
    aUser.setGuild(null);
    aUser.writeMessage((("You leave guild <i>" + (guild.getTitle())) + "</i>.<br/>\r\n"));
    logBean.writeLog(aUser, ("left guild " + (guild.getName())));
    return aUser.getRoom();
}