@java.lang.Override
public void allocateChannels() {
    valueChannel = controller.particles.addChannel(valueChannelDescriptor);
    ParticleChannels.Interpolation4.id = controller.particleChannels.newId();
    interpolationChannel = controller.particles.addChannel(ParticleChannels.Interpolation4);
    lifeChannel = controller.particles.addChannel(ParticleChannels.Life);
}