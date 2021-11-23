@net.minecraftforge.fml.common.eventhandler.SubscribeEvent(priority = net.minecraftforge.fml.common.eventhandler.EventPriority.LOW)
public void onSoundSetup(net.minecraftforge.client.event.sound.SoundSetupEvent event) {
    paulscode.sound.SoundSystemConfig.setNumberStreamingChannels(11);
    paulscode.sound.SoundSystemConfig.setNumberNormalChannels(21);
    try {
        paulscode.sound.SoundSystemConfig.setCodec("ogg", com.creativemd.ambientsounds.CodecJOrbisFixed.class);
    } catch (paulscode.sound.SoundSystemException e) {
        e.printStackTrace();
    }
}