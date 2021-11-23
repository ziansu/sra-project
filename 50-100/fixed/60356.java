public static void main(java.lang.String[] args) {
    util.save.Load load = new util.save.Load();
    java.io.File f = new java.io.File("src/util.tracks/simple_track.json");
    util.save.LoadedRailway l = load.loadFromFile(f, "src/util.tracks/simple_track.json", null);
    util.save.Save save = new util.save.Save();
    save.save(l, "src/util.tracks/test_save");
}