public void send(tech.mcprison.prison.internal.CommandSender sender) {
    java.lang.System.out.println(toJSONString());
    send(sender, toJSONString());
}