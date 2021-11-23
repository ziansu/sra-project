private void play(io.evercam.androidapp.dto.EvercamCamera camera) {
    nativeSetUsername(camera.getUsername());
    nativeSetPassword(camera.getPassword());
    nativePlay();
}