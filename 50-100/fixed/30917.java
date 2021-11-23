private void initializeFakePlayer(net.minecraft.world.World world, java.lang.String uuid, java.lang.String name) {
    fakePlayer = new pneumaticCraft.common.entity.living.EntityDrone.DroneFakePlayer(((net.minecraft.world.WorldServer) (world)), new com.mojang.authlib.GameProfile((uuid != null ? java.util.UUID.fromString(uuid) : null), name), new pneumaticCraft.common.ai.FakePlayerItemInWorldManager(world, fakePlayer, this), this);
    fakePlayer.playerNetServerHandler = new net.minecraft.network.NetHandlerPlayServer(net.minecraft.server.MinecraftServer.getServer(), new net.minecraft.network.NetworkManager(false), fakePlayer);
    fakePlayer.inventory = new pneumaticCraft.common.entity.living.EntityDrone.InventoryFakePlayer(fakePlayer);
    playerName = name;
}