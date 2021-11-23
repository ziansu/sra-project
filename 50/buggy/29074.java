public int commitCurrentEyeRenderTexture(de.fruitfly.ovr.EyeType eye) {
    if (!(isInitialized()))
        return 0;
    
    return _commitCurrentEyeRenderTexture(eye);
}