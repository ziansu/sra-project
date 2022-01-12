public void reconnect(net.dv8tion.jda.core.audio.hooks.ConnectionStatus closeStatus) {
    if (shutdown)
        return ;
    
    connected = false;
    ready = false;
    reconnecting = true;
    changeStatus(closeStatus);
    startConnection();
}