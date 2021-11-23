@com.helen.commands.IRCCommand(command = { ".pronouns" , ".pronoun" }, startOfLine = true, coexistWithJarvis = true)
public void getPronouns(com.helen.commands.CommandData data) {
    if (data.isAuthenticatedUser(magnusMode, true)) {
        helen.sendMessage(data.getResponseTarget(), (((data.getSender()) + ": ") + (com.helen.database.Pronouns.otherPronouns(data.getTarget()))));
    }
}