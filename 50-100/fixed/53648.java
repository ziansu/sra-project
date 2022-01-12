public void loadSounds(java.lang.String[] name, java.lang.String[] location) {
    if ((name.length) == (location.length)) {
        for (int i = 0; i < (name.length); i++) {
            com.jme3.audio.AudioNode audioNode = new com.jme3.audio.AudioNode(mainApp.getAssetManager(), location[i], AudioData.DataType.Buffer);
            sounds.put(name[i], audioNode);
        }
    }
}