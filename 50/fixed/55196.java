public static edu.umass.cs.gnscommon.packets.CommandPacket getCommand(edu.umass.cs.gnscommon.CommandType type, java.lang.Object... keysAndValues) throws edu.umass.cs.gnscommon.exceptions.client.ClientException {
    return edu.umass.cs.gnsclient.client.GNSCommand.getCommand(null, type, null, keysAndValues);
}