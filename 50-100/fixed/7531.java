public static void addPlayerToQueue(java.util.UUID uuid, java.lang.String server, int pos) {
    synchronized(vg.civcraft.mc.bettershards.bungee.QueueHandler.lockingObject) {
        if (!(vg.civcraft.mc.bettershards.bungee.QueueHandler.queue.containsKey(server)))
            vg.civcraft.mc.bettershards.bungee.QueueHandler.queue.put(server, new java.util.ArrayList<java.util.UUID>());
        
        vg.civcraft.mc.bettershards.bungee.QueueHandler.queue.get(server).add(pos, uuid);
        vg.civcraft.mc.bettershards.bungee.QueueHandler.uuidToServerMap.put(uuid, server);
    }
}