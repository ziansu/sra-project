@java.lang.Override
public void dispose() {
    if ((sounds) != null) {
        for (com.bladecoder.engine.model.SoundFX s : sounds.values()) {
            s.dispose();
        }
    }
}