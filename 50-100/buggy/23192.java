public void stop(int id) {
    if (id == (-1)) {
        for (com.badlogic.gdx.audio.Sound s : wavmap) {
            if (s != null) {
                s.stop();
            }
        }
    }else {
        wavmap[id].stop();
    }
}