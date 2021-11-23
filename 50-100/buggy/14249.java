@net.md_5.bungee.event.EventHandler
public void playerLoginNetwork(net.md_5.bungee.api.event.LoginEvent event) {
    java.lang.System.out.println((((redisAPI.getLastOnline(event.getConnection().getUniqueId())) + " ") + (event.getConnection().getUniqueId().toString())));
    if ((redisAPI.getLastOnline(event.getConnection().getUniqueId())) != (-1))
        return ;
    
    pending.add(event.getConnection().getUniqueId());
}