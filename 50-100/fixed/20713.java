public models.MapInfo getMapWithName(java.lang.String map_name) {
    models.MapInfo map = null;
    try {
        map = MapInfo.find.where().like("name", (("%" + map_name) + "%")).findList().get(0);
    } catch (java.lang.Throwable e) {
        play.Logger.error(("Exception at getting map by name(from url): " + e));
    }
    return map;
}