public static de.greenrobot.daogenerator.Entity createWeatherIconTable(de.greenrobot.daogenerator.Schema schema) {
    de.greenrobot.daogenerator.Entity weather_icon_entity = schema.addEntity("WeatherIconTable");
    weather_icon_entity.addIdProperty().primaryKey().autoincrement().notNull();
    weather_icon_entity.addStringProperty("icon_id").unique().notNull();
    weather_icon_entity.addStringProperty("icon_url").notNull();
    weather_icon_entity.addStringProperty("image_path").notNull();
    weather_icon_entity.addByteArrayProperty("image_raw");
    return weather_icon_entity;
}