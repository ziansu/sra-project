@java.lang.Override
public void run() {
    try {
        org.bukkit.Bukkit.getConsoleSender().sendMessage("Jedis is connecting to the Redis Host!");
        redis.clients.jedis.Jedis jedis = new redis.clients.jedis.Jedis(server, port);
        if (password != null) {
            jedis.auth(password);
        }
        org.bukkit.Bukkit.getConsoleSender().sendMessage("Jedis is publishing the given Message to the Redis Host!");
        jedis.publish(channel, message);
        jedis.quit();
    } catch (java.lang.Exception e) {
        e.printStackTrace();
    }
}