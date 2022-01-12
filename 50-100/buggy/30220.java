public static int getLadderPosition(java.lang.String name) {
    Packets.LadderDataPacket data = Utils.ServerUtils.getLadderDataPacket();
    for (int i = 0; i < (data.ladder.size()); i++) {
        java.lang.String line = data.ladder.get(i);
        if (line.split(" | ")[2].equals(name))
            return i;
        
    }
    return -1;
}