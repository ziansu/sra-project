@java.lang.Override
public net.dv8tion.jda.core.entities.PrivateChannel getPrivateChannel() {
    if (!(hasPrivateChannel()))
        throw new java.lang.IllegalStateException("There is no PrivateChannel for this user yet! Use User#openPrivateChannel() first!");
    
    return privateChannel;
}