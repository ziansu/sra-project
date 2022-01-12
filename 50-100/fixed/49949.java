@java.lang.Override
public void deserialize(com.eclipsesource.json.JsonValue json) {
    de.alaoli.games.minecraft.mods.yadm.data.settings.Setting setting;
    for (com.eclipsesource.json.JsonValue value : json.asArray()) {
        setting = de.alaoli.games.minecraft.mods.yadm.data.settings.SettingFactory.createNewInstance(value.asObject().get("type").asString());
        ((de.alaoli.games.minecraft.mods.yadm.json.JsonSerializable) (setting)).deserialize(value);
        this.add(setting);
    }
}