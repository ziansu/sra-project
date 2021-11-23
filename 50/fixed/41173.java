public static void stop() {
    for (org.radargun.cachewrappers.AntidoteConnection connection : org.radargun.cachewrappers.DCManager.connections)
        connection.close();
    
}