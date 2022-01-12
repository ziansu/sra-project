@java.lang.Override
public void handle(io.discloader.discloader.network.gateway.packets.SocketPacket packet) {
    java.lang.String d = this.gson.toJson(packet.d);
    io.discloader.discloader.network.json.MemberJSON data = this.gson.fromJson(d, io.discloader.discloader.network.json.MemberJSON.class);
    io.discloader.discloader.entity.guild.IGuild guild = io.discloader.discloader.common.registry.EntityRegistry.getGuildByID(data.guild_id);
    guild.addMember(data);
}