public static com.sonicether.soundphysics.ReverbParams getReverb3() {
    final com.sonicether.soundphysics.ReverbParams r = new com.sonicether.soundphysics.ReverbParams();
    r.decayTime = 4.142F;
    r.density = 0.5F;
    r.diffusion = 1.0F;
    r.gain = (0.4F * (SoundPhysics.globalReverbMultiplier)) * 0.85F;
    r.gainHF = 0.89F;
    r.decayHFRatio = 0.7F * (Config.globalReverbBrightness);
    r.reflectionsGain = 0.0F;
    r.reflectionsDelay = 0.025F;
    r.lateReverbGain = 1.26F;
    r.lateReverbDelay = 0.021F;
    r.airAbsorptionGainHF = 0.994F;
    r.roomRolloffFactor = 0.11F;
    return r;
}