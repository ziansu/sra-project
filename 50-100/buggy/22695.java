private void loadMusic() {
    manager.setLoader(com.badlogic.gdx.audio.Music.class, new com.badlogic.gdx.assets.loaders.MusicLoader(new com.badlogic.gdx.assets.loaders.resolvers.InternalFileHandleResolver()));
    manager.load(broken.shotgun.throwthemoon.stages.GameStage.MUSIC_FILENAME, com.badlogic.gdx.audio.Music.class);
    manager.finishLoading();
    music = manager.get(broken.shotgun.throwthemoon.stages.GameStage.MUSIC_FILENAME);
    music.setLooping(true);
    music.play();
}