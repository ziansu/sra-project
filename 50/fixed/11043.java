public void UnLoadMod() {
    synchronized(com.peculiargames.andmodplug.PlayerThread.sRDlock) {
        ModPlug_JUnload();
    }
}