public static com.sonicether.soundphysics.ReverbParams getReverb1() {
    final com.sonicether.soundphysics.ReverbParams r = new com.sonicether.soundphysics.ReverbParams();
    r.decayTime = 0.55F;
    r.density = 0.0F;
    r.diffusion = 1.0F;
    r.gain = (0.3F * (SoundPhysics.globalReverbMultiplier)) * 0.85F;
    r.gainHF = 0.99F;
    r.decayHFRatio = 0.7F * (Config.globalReverbBrightness);
    r.reflectionsGain = 0.2F;
    r.reflectionsDelay = 0.015F;
    r.lateReverbGain = 1.26F;
    r.lateReverbDelay = 0.011F;
    r.airAbsorptionGainHF = 0.994F;
    r.roomRolloffFactor = 0.15F;
    return r;
}