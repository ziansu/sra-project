public static com.sonicether.soundphysics.ReverbParams getReverb2() {
    final com.sonicether.soundphysics.ReverbParams r = new com.sonicether.soundphysics.ReverbParams();
    r.decayTime = 1.68F;
    r.density = 0.1F;
    r.diffusion = 1.0F;
    r.gain = (0.5F * (SoundPhysics.globalReverbMultiplier)) * 0.85F;
    r.gainHF = 0.99F;
    r.decayHFRatio = 0.7F * (Config.globalReverbBrightness);
    r.reflectionsGain = 0.0F;
    r.reflectionsDelay = 0.021F;
    r.lateReverbGain = 1.26F;
    r.lateReverbDelay = 0.021F;
    r.airAbsorptionGainHF = 0.994F;
    r.roomRolloffFactor = 0.13F * (Config.rolloffFactor);
    return r;
}