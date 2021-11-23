public void destroy(long id) {
    xyz.gnarbot.gnar.music.MusicManager manager = registry.get(id);
    if (manager != null) {
        manager.destroy();
        registry.remove(id);
    }
}