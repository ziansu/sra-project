@java.lang.Override
@de.btobastian.sdcf4j.Command(aliases = { "property" }, description = "Shows bot's configuration", usage = "property", privateMessages = false)
public java.lang.String executeCommand(de.btobastian.javacord.DiscordAPI api, de.btobastian.javacord.entities.message.Message message, java.lang.String[] args) throws be.perzival.danager.exceptions.command.CommandException {
    try {
        if ((isOwner(api, message)) || (isadmin(api, message))) {
            message.getAuthor().sendMessage(configurationProperties.toString());
        }
    } catch (java.util.concurrent.ExecutionException e) {
        e.printStackTrace();
    } catch (java.lang.InterruptedException e) {
        e.printStackTrace();
    }
    return null;
}