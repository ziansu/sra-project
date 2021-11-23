@java.lang.Override
public void sendFileAsync(java.io.File file, net.dv8tion.jda.entities.Message message, java.util.function.Consumer<net.dv8tion.jda.entities.Message> callback) {
    java.lang.Thread thread = new java.lang.Thread(() -> {
        net.dv8tion.jda.entities.Message messageReturn = sendFile(file, message);
        if (callback != null)
            callback.accept(message);
        
    });
    thread.setName(("PrivateChannelImpl SendFileAsync Channel: " + (id)));
    thread.setDaemon(true);
    thread.start();
}