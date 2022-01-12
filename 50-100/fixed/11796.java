public static void applyConfigChanges() {
    com.sonicether.soundphysics.SoundPhysics.globalReverbMultiplier = 0.7F * (Config.globalReverbGain);
    com.sonicether.soundphysics.SoundPhysics.soundDistanceAllowance = Config.soundDistanceAllowance;
    if ((com.sonicether.soundphysics.SoundPhysics.auxFXSlot0) != 0) {
        com.sonicether.soundphysics.SoundPhysics.setReverbParams(com.sonicether.soundphysics.ReverbParams.getReverb0(), com.sonicether.soundphysics.SoundPhysics.auxFXSlot0, com.sonicether.soundphysics.SoundPhysics.reverb0);
        com.sonicether.soundphysics.SoundPhysics.setReverbParams(com.sonicether.soundphysics.ReverbParams.getReverb1(), com.sonicether.soundphysics.SoundPhysics.auxFXSlot1, com.sonicether.soundphysics.SoundPhysics.reverb1);
        com.sonicether.soundphysics.SoundPhysics.setReverbParams(com.sonicether.soundphysics.ReverbParams.getReverb2(), com.sonicether.soundphysics.SoundPhysics.auxFXSlot2, com.sonicether.soundphysics.SoundPhysics.reverb2);
        com.sonicether.soundphysics.SoundPhysics.setReverbParams(com.sonicether.soundphysics.ReverbParams.getReverb3(), com.sonicether.soundphysics.SoundPhysics.auxFXSlot3, com.sonicether.soundphysics.SoundPhysics.reverb3);
    }
}