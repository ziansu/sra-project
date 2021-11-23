private void proccessCustomPayload(com.comphenix.protocol.events.PacketEvent event, org.bukkit.entity.Player p) {
    java.lang.String channel = event.getPacket().getStrings().readSafely(0);
    if (("MC|BEdit".equals(channel)) || ("MC|BSign".equals(channel))) {
        ru.leymooo.fixer.NBTListener.cancel.put(p, java.lang.System.currentTimeMillis());
    }else
        if ("REGISTER".equals(channel)) {
            checkRegisterChannel(event, p);
        }
    
}