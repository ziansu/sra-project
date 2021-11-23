@java.lang.Override
public void changed(javafx.beans.value.ObservableValue<? extends java.lang.Number> observable, java.lang.Number oldValue, java.lang.Number newValue) {
    double volume = (newValue.doubleValue()) / 100;
    if (bg) {
        sound.MP3handler.setVolumefx(volume);
        start_MEMORY.Start.getJhdl().getModel().getInfo().setVolume_effects(volume);
    }else {
        sound.MP3handler.setVolumebg(volume);
        start_MEMORY.Start.getJhdl().getModel().getInfo().setVolume_music(volume);
    }
}