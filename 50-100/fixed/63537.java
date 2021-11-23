public void addNewMapInfo(java.lang.String name) {
    models.MapInfo map = new models.MapInfo(name, false, null, null, false, 0);
    try {
        map.save();
        play.Logger.info(("Created map info: " + (map.name)));
    } catch (java.lang.Throwable e) {
        flash("error", "Map with same name already exists");
    }
}