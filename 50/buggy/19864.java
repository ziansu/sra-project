private org.jtrfp.trcl.gpu.GLTexture getSkyCubeTexture() {
    if ((skyCubeTexture) == null)
        buildSkyCubeTexture();
    
    return skyCubeTexture;
}