public void setLocation(float x, float y, int z) {
    if ((index) == (-1)) {
        return ;
    }
    org.lwjgl.openal.AL10.alSource3f(store.getSource(index), AL10.AL_POSITION, x, y, z);
}