@java.lang.Override
public void selected(com.badlogic.gdx.utils.Array<com.badlogic.gdx.files.FileHandle> files) {
    pathManager.mapsPath = files.first().file().getAbsolutePath().replace('\\', '/');
    saveMap();
}