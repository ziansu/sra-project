public edu.umass.cs.gnscommon.packets.CommandPacket execute(edu.umass.cs.gnscommon.packets.CommandPacket command) throws edu.umass.cs.gnscommon.exceptions.client.ClientException, java.io.IOException {
    return ((edu.umass.cs.gnscommon.packets.CommandPacket) (this.sendSync(command, edu.umass.cs.gnsserver.gnsapp.GNSClientInternal.getTimeout(command))));
}