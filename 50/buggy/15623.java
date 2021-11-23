public static javax.sound.sampled.Clip getAudio(java.lang.String key) {
    return ((javax.sound.sampled.Clip) (Vortex.System.Assets.AssetManager.ASSET_MAP.get((((Vortex.System.Assets.Types.Audio.TYPE) + ":") + key)).get()));
}